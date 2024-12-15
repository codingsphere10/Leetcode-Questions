class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set=new HashSet<>(banned.length);
        for(int num:banned)
            set.add(num);
        
        int count=0,sum=0;
        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i)){
                if(sum+i<=maxSum){
                    count++;
                    sum=sum+i;
                }
                else
                 break;
            }
        }
        return count;
    }
}