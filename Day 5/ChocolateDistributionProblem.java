import java.util.*;

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
       Collections.sort(a);
       long res=Long.MAX_VALUE;
       for(int i=0;i<n-m+1;i++){
          long minEle=a.get(i);
          long maxEle=a.get(i+m-1);
           res=Math.min(res,maxEle-minEle);
       }
       return res;
        // your code here
    }
}
