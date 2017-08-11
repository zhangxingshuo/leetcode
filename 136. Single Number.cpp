class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int result = 0;
        
        // use fact that a^a = 0, so all XORs cancel except single number
        for (vector<int>::iterator i = nums.begin(); i != nums.end(); ++i) {
            result ^= *i;
        }
        return result;
    }
};
