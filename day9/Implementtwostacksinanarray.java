package day9;
public class Implementtwostacksinanarray {
    class twoStacks {
        int[] arr;
        int size;
        int top1;
        int top2;
        
        twoStacks() {
            arr= new int[100];
            size =100;
            top1=-1;
            top2=100;
            
        }
    
        // Function to push an integer into the stack1.
        void push1(int x) {
            if(top2-top1>1) arr[++top1]=x;
        }
    
        // Function to push an integer into the stack2.
        void push2(int x) {
            if(top2-top1>1) arr[--top2] = x;
        }
    
        // Function to remove an element from top of the stack1.
        int pop1() {
            if(top1>=0) return arr[top1--];
            return -1;
        }
    
        // Function to remove an element from top of the stack2.
        int pop2() {
            if(top2<size) return arr[top2++];
            return -1;
        }
    }
}
