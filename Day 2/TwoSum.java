import java.util.*; // This line of code is just to resolve error while writting code in vsCode

class Solution {
    public int[] twoSum(int[] nums, int target) {
       int ans[]=new int[2];
       HashMap<Integer,Integer>mp=new HashMap<>();
       for(int i=0;i<nums.length;i++){
          int a =target-nums[i];
          if(mp.containsKey(a)){
            ans[0]=i;
            ans[1]=mp.get(a);
            return ans;
          }
          mp.put(nums[i],i);
       }
       return ans;
    }
}
