var kthDistinct = function(arr, k) {
    let mp=new Map();

    for(let word of arr)
    {
      if(mp.has(word))
      {
        let count=mp.get(word) + 1;
        mp.set(word,count); 
      }else{
        mp.set(word,1);
      }  
    }
    let distinct=0;
    for(let [word,count] of mp.entries())
    {
        if(count==1)
        {
            distinct++;
            if(distinct==k)
              return word;
        }
    }
    return "";
};