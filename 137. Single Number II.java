public class Solution {
    public int singleNumber(int[] nums) {
        int a = 0, b = 0;
        for (int num : nums) {
            int temp_a = (~a&b&num) | (a&~b&~num);
            b = (~a&~b&num) | (~a&b&~num);
            a = temp_a;
        }
        return a|b;
    }
}