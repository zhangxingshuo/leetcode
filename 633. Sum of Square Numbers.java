public class Solution {
    public boolean judgeSquareSum(int c) {
        int left = 0, right = (int) Math.sqrt(c);
        while (left <= right) {
            int sum = left*left + right*right;
            if (sum < c) left++;
            else if (sum > c) right--;
            else return true;
        }
        return false;
    }
}