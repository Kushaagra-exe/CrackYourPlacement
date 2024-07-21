package day6;

public class ImplementStackusingQueues {
    class MyStack {
        Queue<Integer> q;

        public MyStack() {
            q= new LinkedList<>();    
        }
    
        public void push(int x) {
            q.add(x);
            for (int i = 1; i < q.size(); i++) {
                q.add(q.remove());
            }
            

        }
        
        public int pop() {
            if(!q.isEmpty())return q.poll();
            else return -1;
        }
        
        public int top() {
            if(!q.isEmpty())return q.peek();
            else return -1;
        }
        
        public boolean empty() {
            return q.isEmpty();
        }
    }
}
