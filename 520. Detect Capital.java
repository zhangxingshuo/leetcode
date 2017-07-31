public class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c - 'Z' <= 0) ++count;
        }
        return count == 0 || count == word.length() || (count == 1 && word.charAt(0) - 'Z' <= 0);
    }
}