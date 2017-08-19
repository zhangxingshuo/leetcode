class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int elem : nums) {
            if (!map.containsKey(elem)) map.put(elem, 1);
            else map.put(elem, 1 + map.get(elem));
            if (map.get(elem) > nums.length / 2) return elem;
        }
        return 0;
    }
}