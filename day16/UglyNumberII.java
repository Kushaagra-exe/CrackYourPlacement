class Solution {
    public int nthUglyNumber(int n) {
        int[] nums = new int[n];
        nums[0]=1;
        int two=0, three=0,five=0;
        for(int i =1; i<n;i++){
            int min = Math.min(Math.min(nums[two]*2,nums[three]*3),nums[five]*5);
            nums[i]=min;
            if(min == nums[two]*2) two++;
            if(min==nums[three]*3) three++;
            if(min==nums[five]*5) five++;
        }
        return nums[n-1];
    }
}