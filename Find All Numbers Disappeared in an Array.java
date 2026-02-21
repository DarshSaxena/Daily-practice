class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     List<Integer>temp =new ArrayList<>();
     int k=1;
     Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1]){
                continue;}
                while(k<nums[i]){
                    temp.add(k);
                    k++;
                
                }
                k=nums[i]+1;}
                
                while(k<=nums.length){
                    temp.add(k);
                    k++;
                }
    
            
        
        return temp;
           
    }
}
