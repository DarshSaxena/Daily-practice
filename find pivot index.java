class Solution {
    public int pivotIndex(int[] nums) {
      int total=0;
      int leftsum=0;
      for(int i=0;i<nums.length;i++)
      {
        total=total+nums[i];
      }  
      for(int i=0;i<nums.length;i++)
      {
         int rightsum=total-leftsum-nums[i];
        if(rightsum==leftsum)
        {
            return i;
        }
        leftsum=nums[i]+leftsum;
      }
      return -1;
    }
}
