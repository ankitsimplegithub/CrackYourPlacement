class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int num : nums){
            start = max(start,num);
            end = end + (num);
        }
        while(start < end){
            int mid = start + (end - start)/2;
            int sum = 0; int pieces =1;
            for(int num : nums){
                if(num + sum > mid){
                    pieces++;
                    sum = num;
                }
                else{
                    sum += num;
                }
            }
            if(pieces > k){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
    static int max(int a, int b){
        return (a>b)? a : b;
    }
}
