class Solution {
    public void swap(int nums[],int a,int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
      int left=0;
      int right=nums.length-1;
      int i=0;

        while(i<=right){
            if(nums[i]==0){
              swap(nums,left++,i++);
            }
            else if(nums[i]==2){
                swap(nums,i,right--);
            }
            else{
                i++;
            }
        }   
    }
}
