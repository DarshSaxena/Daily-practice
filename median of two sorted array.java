class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int n=nums1.length+nums2.length;
      double arr[]=new double[n];
      int k=0;
      for(int i=0;i<nums1.length;i++)
      {
       arr[k]=nums1[i];
        k++;
      }  
      for(int j=0;j<nums2.length;j++){
  arr[k]=nums2[j];
        k++;
      }
      Arrays.sort(arr);
      int start=0;
      int end=n-1;
        int mid=(start+end)/2;
      if(n%2==1){
        return arr[mid];
      }else{
        return (arr[mid]+arr[mid+1])/2.0;
      }
    }
}
