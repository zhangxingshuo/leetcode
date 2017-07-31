public class Solution {
    public int mySqrt(int x) {
        // Newton's iterative method
        long r = x;
        while (r*r > x)
            r = (r + x/r) / 2;
        return (int) r;
    }
}