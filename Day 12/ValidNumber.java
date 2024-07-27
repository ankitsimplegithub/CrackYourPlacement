class Solution {
    public boolean isNumber(String s) {
        // Flags to keep track of various conditions
        boolean numberSeen = false;
        boolean eSeen = false;
        boolean dotCheck = false;// To check if a dot ('.') has been seen

        // Iterate through each character in the string
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);

            // for number
            if(Character.isDigit(ch)){
                numberSeen = true;// Set the flag as we have seen a digit
            }

            // Sign
            else if (ch == '+' || ch == '-'){
                // A sign must either be at the start or immediately after 'e' or 'E'
                if(i>0 && (s.charAt(i-1) != 'e' && s.charAt(i-1) != 'E')){
                    // eg 3e + 7 not valid 
                    // 3e+7 valid
                    return false;
                }
            }
            // dot
            else if(ch == '.'){
                if(dotCheck || eSeen){
                    // A dot is not valid if a dot or 'e'/'E' has already been seen
                    // e ke baad dot ni aata
                    return false;
                }
                dotCheck = true;// Set the flag as we have seen a dot
            }
            // e 
            else if (ch == 'e' || ch == 'E'){
                if(eSeen || !numberSeen){
                    // 'e'/'E' is not valid if it has already been seen or if no digit has been seen before it
                    return false;
                }
                eSeen = true;
                numberSeen  = false;// Reset the digit flag as we need a digit after 'e'/'E'
            }
            else return false;// If the character is none of the above, return false
        }
        // Ensure that the last character seen is a digit
        return numberSeen;
    }
}
