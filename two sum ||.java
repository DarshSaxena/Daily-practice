class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j=numbers.length-1;
        int i=0;
        int temp[]=new int[2];
     while(i<j){
            if(target==numbers[i]+numbers[j]){
                temp[0]=i+1;
                temp[1]=j+1;
                break;
                }
                
            else if (target>numbers[i]+numbers[j]){
            i++;
            }
            else if(target<numbers[i]+numbers[j]){
                j--;
            }
        }
        return temp;
    }
}
