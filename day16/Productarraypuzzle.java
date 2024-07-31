//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
        long tot = 1;
        int zeroes =0;
        
        for(int i: nums){
            if(i!=0) tot*=i;
            if(i==0) zeroes++;
        }
        long[] arr =new long[nums.length];
        
        for(int i=0; i<nums.length;i++){
            if(zeroes == 1 && nums[i]!=0) arr[i]=0;
            else if(zeroes>1) arr[i]=0;
            else if(zeroes==0) arr[i]=tot/nums[i];
            else arr[i]=tot;
            
        }
        
        
        return arr;
	} 
} 
