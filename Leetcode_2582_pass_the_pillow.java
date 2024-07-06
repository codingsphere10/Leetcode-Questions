class Solution {
    public int passThePillow(int n, int time) {
        int pos=time%(n-1);
        int dir=time/(n-1);

        if(dir%2==0)
          return (1+pos);  //left to right
        else
          return (n-pos);
    }
}