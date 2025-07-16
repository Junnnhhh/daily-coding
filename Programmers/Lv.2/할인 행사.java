import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> itemMap = new HashMap<>();
        
        for(int i=0; i<want.length; i++) {
            itemMap.put(want[i], number[i]);
        }
        
        for(int i=0; i<discount.length - 9; i++) {
            
            Map<String, Integer> clone =  new HashMap<>();
            clone.putAll(itemMap);
            
            for(int j=i; j<i+10; j++) {
                String item = discount[j];
                
                if(clone.getOrDefault(item, 0) != 0) {
                    clone.put(item, clone.get(item) - 1);
                }
            }
            
            boolean check = false;
            
            for(String key : clone.keySet()) {
                if(clone.get(key) != 0) {
                    check = true;
                    break;
                }
            }
            
            if(check == false) {
                answer++;
            }
        }
        
        return answer;
    }
}
