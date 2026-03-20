class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left <= right) {
            char chLeft = Character.toLowerCase(s.charAt(left));
            char chRight = Character.toLowerCase(s.charAt(right));
            if(!Character.isLetterOrDigit(chLeft)) {
                left++;
            } else if(!Character.isLetterOrDigit(chRight)){
                right--;
            } else {
                if(chLeft != chRight) return false;
                left++;
                right--;
            }
        }
        return true;
    }
}