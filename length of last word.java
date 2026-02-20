class Solution {
    public int lengthOfLastWord(String s) {
      char str[]=new char[s.length()];
      int k=0;
      int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' ')
        {
            i--;}
            while(i>=0 && s.charAt(i)!=' '){
            char a=s.charAt(i);
                str[k]=a;
                k++;
                i--;
            }
      return k;
    }
}
