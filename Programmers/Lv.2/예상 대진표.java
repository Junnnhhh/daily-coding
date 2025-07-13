class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        int first = a < b ? a : b;
        int last = a > b ? a : b;

        while(true) {
            answer++;
            
            if(first % 2 == 1 && last - first == 1) return answer;
            
            first = (first + 1) / 2;
            last = (last + 1) / 2;
        }
    }
}
