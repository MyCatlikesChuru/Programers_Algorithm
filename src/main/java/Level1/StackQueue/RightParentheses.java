package Level1.StackQueue;

import java.util.Stack;

public class RightParentheses {
    public static void main(String[] args) {
        RightParentheses rightParentheses = new RightParentheses();
        System.out.println(rightParentheses.solution("()()")); // true
        System.out.println(rightParentheses.solution("(())()")); // true
        System.out.println(rightParentheses.solution(")()(")); // false
        System.out.println(rightParentheses.solution("(()(")); // false
    }
    boolean solution(String s) {
        // "("로 시작하면 push하여 Stack에 저장
        // ")"로 시작하면 pop 진행, 만약 pop했을때 데이터가 없다면 false 리턴
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') stack.push("(");
            else {
                if(stack.size()>0) stack.pop();
                else return false;
            }
        }
        if(stack.size()!=0) return false;

        return true;
    }
}
