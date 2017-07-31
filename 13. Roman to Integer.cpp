class Solution {
public:
    int romanToInt(string s) {
        int total = 0;
        for (string::iterator i = s.begin(); i != s.end(); ++i) {
            int val = value(*i);
            if (i + 1 == s.end()) total += val;
            else {
                int nextVal = value(*(i+1));
                if (nextVal > val) {
                    total += nextVal - val;
                    ++i;
                }
                else {
                    total += val;
                }
            }
        }
        return total;
    }
    
    int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
};