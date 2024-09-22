class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] arr=new boolean[26];
        int count=0;

        for(char ch:allowed.toCharArray())
           arr[ch-'a']=true;
        
        for(String word:words){
           boolean consistent=true;
           for(char ch:word.toCharArray()){
              if(arr[ch-'a']==false){
                consistent=false;
                break;
              }
           } 
           if(consistent==true)
              count++;
        }
        return count;
    }
}