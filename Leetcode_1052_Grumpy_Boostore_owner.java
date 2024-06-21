class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
      int count=0; //satisfied customer count
      int additional=0; // additional satisfied customer count  
      int max_additional=0; // maximum additional satisfied customer count

      for(int i=0;i<customers.length;i++)
      {
         if(grumpy[i]==0)
           count= count + customers[i];
         else 
           additional=additional + customers[i];
        
        if(i>=minutes && grumpy[i-minutes]==1)
           additional=additional - customers[i-minutes];
        if(additional>max_additional)
          max_additional=additional;
      }  
      return count + max_additional;
    }
}