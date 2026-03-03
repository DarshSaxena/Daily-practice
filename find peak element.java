class Solution {
    public int findPeakElement(int[] nums) {
     int start=0;
      int mid=0;
     int end=nums.length-1;
    while(start<end){
         mid=(start+end)/2;
        if(nums[mid]==nums[mid+1]){
        return nums[mid];}
        else if(nums[mid]<nums[mid+1])
        {
            start=mid+1;
        }
        else if (nums[mid]>nums[mid+1])
        {
            end=mid;
        }
            }
            return start;
    }
}
