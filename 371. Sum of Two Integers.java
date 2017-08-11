public class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            // like adding by hand in decimal
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
