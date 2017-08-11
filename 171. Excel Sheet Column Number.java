public class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            // convert base 26 to decimal
            int val = s.charAt(i) - 'A' + 1;
            num = num * 26 + val;
        }
        return num;
    }
}
