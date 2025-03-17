class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedStr = new StringBuilder();
        int i = 0;
        while (i < word1.length() && i < word2.length()) {
            mergedStr.append(word1.charAt(i)).append(word2.charAt(i++));
        }

        if (i < word1.length())
            mergedStr.append(word1.substring(i));
        else if (i < word2.length())
            mergedStr.append(word2.substring(i));

        return mergedStr.toString();
    }
}
