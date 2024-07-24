package day9;

import java.util.Stack;

public class TheCelebrityProblem {
    class Solution
{   boolean knows(int a, int b, int[][] x){
        
        return x[a][b]==1;
    }

    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> st = new Stack<>();
    	for(int i =0; i<n; i++){
    	    st.push(i);
    	}
    	while(st.size()>1){
    	    int ele1 = st.pop();
    	    int ele2 = st.pop();
    	    
    	    if(knows(ele1, ele2, M)){
    	        st.push(ele2);
    	    }
    	    else if(knows(ele2, ele1, M)){
    	        st.push(ele1);
    	    }
    	}
    	int col = 0;
    	for(int i =0; i<n; i++){
    	    if(M[st.peek()][i]!=0) return -1;
    	}
    	for(int i =0; i<n; i++){
    	    if(M[i][st.peek()]!=1) col++;
    	}
    	if(col>1) return -1;
    	else return  st.peek();
    }
}
}
