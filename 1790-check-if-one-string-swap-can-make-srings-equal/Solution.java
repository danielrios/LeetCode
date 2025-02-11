class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        int indexOne = 0, indexTwo = 0, countDiff = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                countDiff++;
                if (countDiff == 1)
                    indexOne = i;
                else if (countDiff == 2)
                    indexTwo = i;
                else
                    return false;
            }
        }
        if (s1.charAt(indexOne) == s2.charAt(indexTwo) && s1.charAt(indexTwo) == s2.charAt(indexOne))
            return true;
        return false;
    }
}