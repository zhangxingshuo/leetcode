public class Solution {
    public int singleNumber(int[] nums) {
        // make a three-counter
        int a = 0, b = 0;
        for (int num : nums) {
            int temp_a = (~a&b&num) | (a&~b&~num);
            b = (~a&~b&num) | (~a&b&~num);
            a = temp_a;
        }
        // return number whose count is 1
        return a|b;
    }
}
