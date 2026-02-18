class Solution {
    public int duplicateNumbersXOR(int[] nums) {
      int result=0;
      Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                result=result^nums[i];
            }
        }
      return result;  
    }
}
