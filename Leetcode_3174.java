class Solution {
    public String clearDigits(String s) {
      StringBuilder sb=new StringBuilder();
      int i=-1;

      for(char ch:s.toCharArray())
      {
        if(ch>='0' && ch<='9')
          sb.deleteCharAt(i--);
        else{
            sb.append(ch);
            i++;
        }   
      } 
      return sb.toString();
    }
}