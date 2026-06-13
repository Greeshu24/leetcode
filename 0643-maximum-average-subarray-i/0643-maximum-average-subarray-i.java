class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double maxSum=0;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum=sum;
        for(int i=k;i<n;i++){
            sum=sum-nums[i-k];
            sum=sum+nums[i];
            if(maxSum<sum)
            maxSum=sum;
        }
        return maxSum/k;
    }
}