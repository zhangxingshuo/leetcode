class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        L = list(ransomNote)
        for char in magazine:
            if char in L:
                L.remove(char)
        return len(L) == 0