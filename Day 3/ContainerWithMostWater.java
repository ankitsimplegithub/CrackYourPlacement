class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int s = 0;
        int e = height.length-1;

        while(s<e){
            int h = Math.min(height[s],height[e]);
            int amt = h*(e-s);
            if(max<amt) max = amt;
            while(s<e && height[s]<=h){
                s++;
            }
            while(s<e && height[e]<=h){
                e--;
            }
        }
        return max;
    }
}
