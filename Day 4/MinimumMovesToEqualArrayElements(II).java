import java.util.*;

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int i=0 ,j=nums.length-1;
        int step=0;
        while(i<j){
           step+=(nums[j]-nums[i]);
           i++;
           j--;
        }
        return step;
    }
}
