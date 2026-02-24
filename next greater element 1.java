class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Stack<Integer>stack=new Stack<>();
    HashMap<Integer,Integer>map =new HashMap<>();
    for(int i=0;i<nums2.length;i++){
        int num=nums2[i];
        while(!stack.isEmpty() && num>stack.peek()){
            int prev=stack.pop();
            map.put(prev,num);}
            stack.push(num);}
            while(!stack.isEmpty()){
                map.put(stack.pop(),-1);
            }
            int ans[]=new int[nums1.length];
            for(int i=0;i<nums1.length;i++){
                ans[i]=map.get(nums1[i]);}
     return ans;
        }}
    
