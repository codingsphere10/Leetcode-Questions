class Solution {
    public int findMinDifference(List<String> timePoints) {
      int[] minutePoints=new int[timePoints.size()];
      int idx=0;

      for(String point:timePoints)
      {
        String[] time=point.split(":");
        int minutes=Integer.parseInt(time[0])*60 + 
                    Integer.parseInt(time[1]);
        minutePoints[idx++]=minutes;
      } 
      Arrays.sort(minutePoints);
      int prev=-1, min=Integer.MAX_VALUE;
      for(int minute:minutePoints)
      {
        if(prev==-1)
        {
          prev=minute;
          //handling circular case
          min=24*60-minutePoints[minutePoints.length-1] + minute;
          continue;  
        }
        int diff=minute-prev;
        if(diff<min) min=diff;
        prev=minute;
      } 
      return min; 
    }
}