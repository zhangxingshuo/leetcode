class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        d = {}
        for char in s:
            if char in d:
                d[char] += 1
            else:
                d[char] = 1
        longest = 0
        has_odd = False
        for char, count in d.items():
            longest += int(math.floor(count/2) * 2)
            if count % 2 != 0:
                has_odd = True
        if has_odd:
            return longest + 1
        else:
            return longest