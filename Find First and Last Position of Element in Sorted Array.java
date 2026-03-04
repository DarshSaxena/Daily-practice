class Solution
{
    public int[] searchRange(int[] nums, int target)
    {
         int start=0;
         int end=nums.length-1;
         int mid;
         int a=-1;
         int b=-1;
         while(start<=end) 
         {
            mid=(start+end)/2;
            if(nums[mid]==target){
             a=mid;
             end=mid-1;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {end=mid-1;}
         }
         start = 0;
            end = nums.length - 1;
          while(start<=end) {

            mid=(start+end)/2;
            if(nums[mid]==target){
            b=mid;
            start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            else if(nums[mid]<target)
            {
                start=mid+1;
            }
         }
return new int[]{a, b};
         }  
    }
