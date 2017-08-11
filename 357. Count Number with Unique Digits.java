public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        // f(0) = 1
        // f(1) = 10
        // combinatorial problem, for each digit n, there are
        // 9 choices for first digit, 9 choices for second, 8
        // for third, and so on
        // f(2) = 9*9
        // f(3) = f(2)*8 = 9*9*8
        // f(4) = f(3)*7 = 9*9*8*7
        // ...
        // f(9) = 9*9*8*7*6*5*4*3*2*1
        // f(10) = 0
        if (n == 0) return 1;
        int ans = 10, base = 9;
        for (int i = 2; i <= n && i <= 10; i++) {
            base = base * (9 - i + 2);
            ans += base;
        }
        return ans;
    }
}
