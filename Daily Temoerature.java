class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer>temp=new Stack<>();
       int n=temperatures.length;
       int ans[]=new int[n];
       for(int i=0;i<n;i++){
       while(!temp.isEmpty() && temperatures[i]>temperatures[temp.peek()]){
         
    int prev=temp.pop();
    ans[prev]=i-prev;}

    temp.push(i);
}
return ans;}}
