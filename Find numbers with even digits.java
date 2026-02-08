class Solution {
    public int findNumbers(int[] nums) {
       int sum=0;
       for(int i=0;i<nums.length;i++)
       {
        int n=nums[i];
        int digit=0;
        while(n>0)
        {
            digit++;
            n=n/10;
        }
        if(digit%2==0)
        {
            sum=sum+1;
        }
       } 
       return sum;

    }
}
