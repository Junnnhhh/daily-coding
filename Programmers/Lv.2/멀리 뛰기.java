class Solution {
    public long solution(int n) {
        return fibonachi(n, 0, 1);
    }
    
    public long fibonachi(int n, long a, long b) {
        long sum = a + b;
        
        if(n <= 1) return sum % 1234567;
        
        return fibonachi(n - 1, b, sum % 1234567) % 1234567;
    }
}
