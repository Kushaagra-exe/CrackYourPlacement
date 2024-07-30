package day15;

import java.util.Arrays;

public class MinimumMovestoEqualArrayElements {
    class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int med = nums[nums.length/2], ans = 0;
        for(int i : nums){
            ans+= Math.abs(med-i);
        }
        return ans;
    }
}
}
