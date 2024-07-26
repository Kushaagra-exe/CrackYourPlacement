package day11;

import java.util.Stack;

public class ValidParentheses {
    class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char a =s.charAt(i); 
            if(a=='(' || a=='[' || a=='{'){
                st.push(a);
            }else{
                if(st.isEmpty()) return false;
                char top = st.peek();
                if(a==')' &&top=='(' || a==']' &&top=='[' || a=='}' &&top=='{'){
                    st.pop();
                }else return false;
            }

        }
        return st.isEmpty();
    }
}
}
