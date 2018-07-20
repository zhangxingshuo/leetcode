class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        s = list(s)
        vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        left = 0
        right = len(s)-1
        while left < right:
            while s[left] not in vowels and left < len(s) - 1:
                left += 1
            while s[right] not in vowels and right >= 0:
                right -= 1
            if left >= right:
                break
            tmp = s[left]
            s[left] = s[right]
            s[right] = tmp
            left += 1
            right -= 1
        return "".join(s)