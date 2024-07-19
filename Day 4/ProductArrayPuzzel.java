class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // Initialize the left and right product arrays
        long[] left = new long[n];
        long[] right = new long[n];
        long[] product = new long[n];
        
        // Initialize the first element of left array and last element of right array
        left[0] = 1;
        right[n - 1] = 1;
        
        // Construct the left product array
        for (int i = 1; i < n; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        
        // Construct the right product array
        for (int j = n - 2; j >= 0; j--) {
            right[j] = nums[j + 1] * right[j + 1];
        }
        
        // Construct the product array
        for (int i = 0; i < n; i++) {
            product[i] = left[i] * right[i];
        }
        
        return product;
	} 
} 
