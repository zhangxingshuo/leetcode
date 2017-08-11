public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length];
        for (int num : nums) count[num-1]++;
        int[] results = new int[2];
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 2) results[0] = i+1;
            else if (count[i] == 0) results[1] = i+1;
        }
        return results;
    }
}