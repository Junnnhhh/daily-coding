import java.util.*;

class Solution {
    public int solution(int[] elements) {
        
        int size = elements.length;
        Set<Integer> sum_set = new HashSet<>();
        
        for(int idx=1; idx<=size; idx++) {  
            for(int j=0; j<size; j++) {
                int sum = 0;
                
                for(int k=j; k<j+idx; k++) {
                    sum += elements[k % size];
                }
                
                sum_set.add(sum);
            }
        }
        
        return sum_set.size();
    }
}
