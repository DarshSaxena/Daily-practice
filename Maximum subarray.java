class Solution {
    public int maxSubArray(int[] nums) {
       int max=Integer.MIN_VALUE;
       int sum=0;
       int finalsum=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++)
       {
        sum=sum+nums[i];
        finalsum=Math.max(finalsum,sum);
        if(sum<0){
        sum=0;
       } 
       }
       return finalsum;
    }
}
