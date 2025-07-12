import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> stk = new Stack<Character>();
        
        for(int i = 0; i<s.length(); i++) {
            
            char ch = s.charAt(i);
            
            if(stk.empty()) {
                stk.push(ch);
            } else {
                if(stk.peek() == ch) {
                    stk.pop();
                } else {
                    stk.push(ch);
                }
            }
        }
        
        answer = stk.empty() ? 1 : 0;

        return answer;
    }
}
