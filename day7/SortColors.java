package day7;

public class SortColors {
    class Solution {
        public void swap(int[] nums, int a, int b) {
            int t = nums[a];
            nums[a]=nums[b];
            nums[b]=t;
        }
        public void sortColors(int[] nums) {
            int zero=0, two=nums.length-1;
            int t=0;
            while(t<=two){
                if(nums[t]==0){
                    swap(nums,t,zero);
                    zero++;
                    t++;
                }
                else if(nums[t]==2){ 
                    swap(nums,t,two);
                    two--;    
                }
                else t++;
            }
        }
    }
}
