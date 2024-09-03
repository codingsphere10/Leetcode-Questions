class Solution {
    public int sumOfDigits(int num,int k)
    { int sum=num;
      for(int i=1;i<=k;i++)
      {
        sum=0;
        while(num!=0)
        {
           sum =sum + num%10;
           num=num/10;
        }
        num=sum;
      }
      return sum;  
    }
    public int getLucky(String s, int k) {
        int sum=0;
        for(char ch:s.toCharArray())
        {
          int val=ch-'a' + 1; 
          while(val!=0)
          {
            sum +=val%10;
            val=val/10;
          }
        }
       return sumOfDigits(sum,k-1);
    }
}