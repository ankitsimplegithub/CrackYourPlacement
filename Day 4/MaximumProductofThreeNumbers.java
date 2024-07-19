import java.util.*;

class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        
        // Maximum product of the three largest numbers
        int max1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        
        // Maximum product of the two smallest numbers and the largest number
        int max2 = nums[0] * nums[1] * nums[n - 1];
        
        // Return the maximum of the two products
        return Math.max(max1, max2);
    
    }
}
