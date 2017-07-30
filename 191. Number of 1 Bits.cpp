class Solution {
public:
    int hammingWeight(uint32_t n) {
        int result = 0;
        while (n) {
            // remove least significant 1
            n &= n - 1;
            ++result;
        }
        return result;
    }
};
