class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
      int min=arrays.get(0).get(0);
      int idx=arrays.get(0).size()-1;
      int max=arrays.get(0).get(idx);
      int maxDist=0;  
      
      for(int i=1;i<arrays.size();i++)
      {
        int dist=Math.abs(max-arrays.get(i).get(0));
        if(dist>maxDist)
           maxDist=dist;
        
        idx=arrays.get(i).size()-1;
        dist=Math.abs(arrays.get(i).get(idx)-min);
        if(dist>maxDist)
           maxDist=dist;

        min=Math.min(min,arrays.get(i).get(0));
        max=Math.max(max,arrays.get(i).get(idx));

      }
      return maxDist;
    }
}