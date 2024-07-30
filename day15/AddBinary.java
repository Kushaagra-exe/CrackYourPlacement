package day15;

public class AddBinary {
    class Solution {
        public String addBinary(String a, String b) {
            String ans = "";
            int carry =0;
            int i=a.length()-1, j =b.length()-1;
            while(i>=0 || j>=0|| carry==1){
                if(i>=0) carry += a.charAt(i--)-'0';
                if(j>=0) carry += b.charAt(j--)-'0';
                ans= (char) ('0'+carry%2)+ans;
                carry/=2;
            }
            return ans;
        }
    }
}
