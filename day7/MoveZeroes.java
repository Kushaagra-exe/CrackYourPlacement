package day7;

public class MoveZeroes {
    class Solution {
        public void swap(int[] nums, int a, int b) {
            int t= nums[a];
            nums[a] = nums[b];
            nums[b]=t;
        }
        
        public void moveZeroes(int[] nums) {
            int index = 0;
            for(int i=0; i<nums.length;i++){
                if(nums[i]!=0){
                    swap(nums,i,index);
                    index++;
                }
            }
            
        }
    }
}
