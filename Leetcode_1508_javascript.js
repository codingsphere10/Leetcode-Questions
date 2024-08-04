var rangeSum = function(nums, n, left, right) {
    let size=nums.length*(nums.length+1);
    let arr=new Array(size/2);
    let idx=0;
    for(let i=0;i<nums.length;i++)
    {
      let sum=0;
      for(let j=i;j<nums.length;j++)
      {
         sum=sum+nums[j];
         arr[idx++]=sum;
      }
    } 
    arr.sort((a,b)=>a-b);
    let res=0;
    const MOD= 1e9 + 7;
    for(let i=left-1;i<right;i++)
    {
      res=(res+arr[i])%MOD;
    }
    return res;
 };
 
 