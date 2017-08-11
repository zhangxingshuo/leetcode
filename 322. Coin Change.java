public class Solution {
    public int coinChange(int[] coins, int amount) {
        // dynamic programming
        int arr[] = new int[amount+1];
        Arrays.fill(arr, amount+1);
        arr[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int coin : coins) {
                if (coin <= i) arr[i] = Math.min(arr[i], 1 + arr[i - coin]);
            }
        }
        return arr[amount] > amount ? -1 : arr[amount];
    }
}
