class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n=s1.length();
        int count=0;
        int[] arr=new int[26];

        for(int i=0;i<n;i++)
        {
           char ch1=s1.charAt(i);
           char ch2=s2.charAt(i);
           if(ch1!=ch2) count++;
           arr[ch1-'a']++; 
           arr[ch2-'a']--; 
        }
        for(int i=0;i<26;i++)
        {
           if(arr[i]!=0) return false;
        }

       return  count==0 || count==2;        
    }
}