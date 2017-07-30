class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int currentOnes = 0;
        int maxOnes = 0;
        for (vector<int>::iterator i = nums.begin(); i != nums.end(); ++i) {
            if (*i == 1) ++currentOnes;
            else {
                if (currentOnes > maxOnes) maxOnes = currentOnes;
                currentOnes = 0;
            }
        }
        return max(maxOnes, currentOnes);
    }
};