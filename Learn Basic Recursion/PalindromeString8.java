class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right){
            // Skip left non-alphanumeric
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            // Skip right non-alphanumeric
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            // Check if characters don't match
            else if(Character.toLowerCase(s.charAt(left)) != 
                    Character.toLowerCase(s.charAt(right))){
                return false;
            }
            // Both valid and match - move both pointers
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}