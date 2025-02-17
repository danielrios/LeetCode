class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0, tLength = t.length(), sLength = s.length();
        while (i < sLength && j < tLength) {
            if (s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i == sLength;
    }
}