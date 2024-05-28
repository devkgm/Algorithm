import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        try {
            for(char c: s.toCharArray()){
                if(c == '(') {
                    stack.push(c);
                } else {
                    if(stack.pop() != '(') return false;
                }
            }
            if(!stack.empty()) return false;
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}