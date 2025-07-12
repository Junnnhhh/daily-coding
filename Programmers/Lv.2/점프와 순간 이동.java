public class Solution {
    public int solution(int n) {
        return process(n);
    }
    
    public int process(int n) {
        if(n == 1) return 1;
        
        if(n % 2 == 0) {
            return process(n/2);
        } else {
            return process((n-1)/2) + 1;
        }
    }
}
