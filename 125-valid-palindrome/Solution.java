class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        if (s.isEmpty())
            return true;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(s.length() - 1 - i) != s.charAt(i))
                return false;
        }
        return true;
    }
}