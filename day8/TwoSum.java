package day8;

public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int res[] = new int[2];
            int ind=1;
            while(ind<nums.length){
                for(int i=0; i+ind<nums.length;i++){
                    if(nums[i]+nums[i+ind]==target){
                        res[0]=i;
                        res[1]=i+ind;
                        return res;
                    }
                }
            }
            return res;
        }
    }
}
