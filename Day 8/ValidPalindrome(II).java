class Solution {
    public boolean validPalindrome(String s) {
        int left = s.length()-1;
        int right = 0;

        while(right<=left) {
            if(s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s.substring(right+1,left+1)) ||  isPalindrome(s.substring(right,left));
            }
            right++;
            left--;
        }
        return true;
    }

    public boolean isPalindrome(String s) {

        int left = s.length() - 1;
        int right = 0;
        while(left>=right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left--;
            right++;
        }
        return true;
    }
}
