class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int totalSum = Arrays.stream(nums).sum();
        for(int i=0;i<nums.length;i++){
            int rightSum = totalSum-leftSum-nums[i];
            if(rightSum==leftSum)   return i;
            leftSum+=nums[i];

        }
        return -1;
    }
}