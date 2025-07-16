class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        int vowels = 0, consonants = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!Character.isLetterOrDigit(ch)) return false;
            if (Character.isLetter(ch)) {
                char lower = (char) (ch | 32);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') vowels++;
                else consonants++;
            }
        }
        return vowels > 0 && consonants > 0;
    }
}