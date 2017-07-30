class Solution {
public:
    int addDigits(int num) {
        // digital root problem
        return 1 + (num - 1) % 9;
    }
};