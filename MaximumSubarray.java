class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currentSum = 0;
        int sum = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            if(currentSum < 0){
                currentSum = 0;
            }
            currentSum += nums[i];
            if(currentSum > sum){
                sum = currentSum;
            }
        }
        return sum;
    }
}