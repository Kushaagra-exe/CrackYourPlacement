package day6;

import java.util.Stack;

public class ImplementQueueusingStacks {
    class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    int top;

    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
        
    }
    
    public void push(int x) {
        if(s1.isEmpty()){
            top =x;
        }
        s1.push(x);
    }
    
    public int pop() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()) s2.push(s1.pop());
        }
        return s2.pop();
    }
    
    public int peek() {
        return (s2.isEmpty())?top:s2.peek();        
    }
    
    public boolean empty() {
        return (s1.isEmpty() && s2.isEmpty());
    }
}
}
