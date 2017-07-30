public class Solution {
    public int climbStairs(int n) {
        // dynamic programming
        // int[] fib = new int[n+1];
        // fib[0] = 1;
        // fib[1] = 1;
        // for(int i = 2; i < n + 1; ++i) {
        //     fib[i] = fib[i-1] + fib[i-2];
        // }
        // return fib[n];
        return climbStairsBinet(n+1);
    }
    
    public int climbStairsBinet(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double phi_bar = (1 - Math.sqrt(5)) / 2;
        return (int) (1 / Math.sqrt(5) * (Math.pow(phi, n) - Math.pow(phi_bar, n)));
    }
}