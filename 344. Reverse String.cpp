class Solution {
public:
    string reverseString(string s) {
        // reverse(s.begin(), s.end());
        // return s;
        size_t n = s.length();
        for (size_t i = 0; i < n/2; ++i) {
            swap(s[i], s[n-i-1]);
        }
        return s;
    }
};