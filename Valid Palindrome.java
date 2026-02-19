class Solution {
    public boolean isPalindrome(String s) {
        char str[]=new char[s.length()];
        int k=0;
        
      for(int i=0;i<s.length();i++)
      {
        char a= s.charAt(i);
        char ch=Character.toLowerCase(a);
        if((ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
        {
        str[k]=ch;
        k++;
      }  }
      int j=k-1;
      int p=0;
     while(p<j)
      {
        if(str[p]!=str[j]){
        return false;
      }
       p++;
        j--;
    }
return true;
}}
