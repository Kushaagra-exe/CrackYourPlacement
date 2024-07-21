package day6;

import java.util.Stack;

public class EvaluationofPostfixExpression {
    class Solution
{
    //Function to evaluate a postfix expression.
    
    public static int operate(int a, int b, char c){
        
        
        // int res;/
        if(c=='+') return a+b;
        else if(c=='-') return a-b;
        else if(c=='*') return a*b;
        else if(c=='/') return (a==0)?0:a/b;
        return 0;
    }
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> st = new Stack<>();
        for(char c : S.toCharArray()){
            if(c=='-' || c== '+' || c =='*' || c=='/'){
                int a = st.pop();
                int b = st.pop();
                st.push(operate(b,a , c));
            } else st.push(c-'0');
        }
        return st.pop();
        
    }
}
}
