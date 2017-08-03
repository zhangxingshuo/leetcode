public class Solution {
    public String convertToTitle(int n) {
        String res = "";
        while (n > 0) {
            int val = ((n-1) % 26) + 'A';
            res = (char) val + res;
            n = (n-1) / 26;
        }
        return res;
    }
}