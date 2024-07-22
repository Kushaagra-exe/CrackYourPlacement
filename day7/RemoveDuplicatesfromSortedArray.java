package day7;

public class RemoveDuplicatesfromSortedArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int index =1;
            if(nums.length==1 ) return 1;
    
            for(int i =1; i<nums.length; i++){
                if(nums[i-1]!=nums[i]){
                    nums[index]=nums[i];
                    index++;
                }
            }
            return index;
        }
    }
}
