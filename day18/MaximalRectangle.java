import java.util.Stack;

public class MaximalRectangle {
    class Solution {
    public void nextSmall(int[] arr, int[] next){
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            if(st.isEmpty()) next[i]=-1;
            else next[i]=st.peek();
            st.push(i);

        }
    }

    public void prevSmall(int[] arr, int[] prev){
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
            if(st.isEmpty()) prev[i]=-1;
            else prev[i]=st.peek();
            st.push(i);
            
        }
    }

    public int calcArea(int[] hist){
        int[] next = new int[hist.length];
        int[] prev = new int[hist.length];
        nextSmall(hist, next);
        prevSmall(hist, prev);
        int area = hist[0];
        for(int i =0; i<next.length;i++){
            int h = hist[i];
            if(next[i]==-1) next[i]=hist.length;
            int l = next[i]-prev[i]-1;

            int narea = l*h;
            area = Math.max(area, narea);
        }
        return area;

    }

    // public void nextSmall(int [] arr, int[] next){
    //     Stack<Integer> st = new Stack<>();
        
    //     for(int i=arr.length-1; i>=0; i--){
    //         while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
    //         if(st.isEmpty()) next[i]=-1;
    //         else next[i]=st.peek();
    //         st.push(i);
    //     }
    // }
    // public void prevSmall(int [] arr, int[] prev){
    //     Stack<Integer> st = new Stack<>();
        
    //     for(int i=0; i<arr.length; i++){
    //         while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
    //         if(st.isEmpty()) prev[i]=-1;
    //         else prev[i]=st.peek();
    //         st.push(i);
    //     }
    // }
    // public int calArea(int[] arr){
    //     int [] n = new int[arr.length];
    //     int [] p = new int[arr.length];
    //     prevSmall(arr,p);
    //     nextSmall(arr,n);
    //     int area =arr[0];
    //     for(int i=0; i<arr.length; i++){
    //         int l = arr[i];
    //         if(n[i]==-1) n[i]=arr.length;
    //         int b= n[i]-p[i]-1;
    //         area = Math.max(area, l*b);
            
    //     }
    //     return area;
    // }
    public int maximalRectangle(char[][] matrix) {
        int[][] mat = new int[matrix.length][matrix[0].length];
        for(int i =0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]=='1') mat[i][j]=1;
                else mat[i][j]=0;
            }
        }
        int area = calcArea(mat[0]);
        for(int i =1; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]!=0) mat[i][j] = mat[i][j]=mat[i][j]+mat[i-1][j];
                else mat[i][j]=0;
            }
            area =Math.max(area, calcArea(mat[i]));
        }
        return area;
    }
}
}
