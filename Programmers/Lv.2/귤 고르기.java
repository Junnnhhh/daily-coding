import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0; i<tangerine.length; i++) {
            int cnt = map.getOrDefault(tangerine[i], 0);
            
            map.put(tangerine[i], cnt + 1);
        }
        
        for(Integer key : map.keySet()) {
            list.add(List.of( key, map.get(key) )); 
        }
        
        Collections.sort(list, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o2.get(1).compareTo(o1.get(1));
            }
        });
        
        int sum = 0;
        for(int i=0; i<list.size(); i++) {           
            sum += list.get(i).get(1);
            
            if(sum >= k) {
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}
