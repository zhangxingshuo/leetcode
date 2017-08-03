public class Solution {
    public int countPrimes(int n) {
        // sieve of eratosthenes
        boolean[] composite = new boolean[n];
        int count = 0;
        for (int m = 2; m < n; m++) {
            if (!composite[m]) {
                count++;
                for (int k = 2; k*m < n; k++) {
                    composite[k*m] = true;
                }
            }
        }
        return count;
    }
}
