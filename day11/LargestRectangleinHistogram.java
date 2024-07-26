package day11;

import java.util.Stack;

public class LargestRectangleinHistogram {
    class Solution {
    public void nextSmall(int[] arr, int[] next){
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1; i>=0; i--){

            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            if(st.isEmpty()) next[i] = -1;
            else next[i] = st.peek();
            st.push(i);
        }
    }

    public void prevSmall(int[] arr, int[] prev){
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<arr.length; i++){

            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            if(st.isEmpty()) prev[i] = -1;
            else prev[i] = st.peek();
            st.push(i);
        }
    }
    public int largestRectangleArea(int[] heights) {
        int[] n = new int[heights.length];
        int[] p = new int[heights.length];
        nextSmall(heights, n);
        prevSmall(heights, p);
        int area = heights[0];
        
        for(int i=0; i<heights.length; i++){
            int h = heights[i];
            if(n[i]==-1) n[i]=heights.length;
            int b = n[i]-p[i]-1;
            int narea = h*b;
            area = Math.max(area, narea);
        }
        return area;
    }  j
}
}
