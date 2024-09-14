// Approach 1:
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
      int[] res=new int[queries.length];
      int idx=0;  

      for(int[] query:queries)
      {
        int xor=arr[query[0]];
        for(int i=query[0]+1;i<=query[1];i++)
          xor=xor ^ arr[i];
        
        res[idx++]=xor;
      }
      return res;
    }
}

// Approach 2:(Efficient)
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
      int[] res=new int[queries.length];
      int[] preSum=new int[arr.length];
      int idx=0; 
      preSum[0]=arr[0];
      for(int i=1;i<arr.length;i++)
        preSum[i]=preSum[i-1] ^ arr[i];
      
      for(int[] query:queries)
      {
        int low=query[0]-1;
        int high=query[1];
        int tmp=preSum[high];
        if(low>=0)
          tmp=tmp ^ preSum[low];
        res[idx++]=tmp;
      }
      return res;
    }
}