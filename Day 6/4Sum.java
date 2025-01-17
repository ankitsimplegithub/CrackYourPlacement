import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //@SuppressWarnings({ "rawtypes", "unchecked" }) // this line is just for remove error in vsCode.
        List<List<Integer>> a = new ArrayList();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    long s = (long) (nums[i] + nums[j]) + (long) (nums[k] + nums[l]);
                    if (s < target)
                        k++;
                    else if (s > target)
                        l--;
                    else if (s == target) {
                        List<Integer> li = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        a.add(li);
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1])
                            k++;
                        while (k < l && nums[l] == nums[l + 1])
                            l--;
                    }
                }
            }
        }
        return a;
    }
}
