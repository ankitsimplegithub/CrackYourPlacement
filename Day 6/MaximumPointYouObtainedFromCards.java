class Solution {
    public int maxScore(int[] nums, int k) {
        int n=nums.length;
       int lsum=0 , rsum=0 ;
       int maxsum=0;
       int ridx=n-1;
        for(int i=0;i<k;i++){
          lsum=lsum+nums[i]; 
        }
        maxsum=lsum;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-nums[i];
            rsum=rsum+nums[ridx];
            ridx--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum; 
    }
}
