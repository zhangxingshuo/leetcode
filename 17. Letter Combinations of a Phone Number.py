class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        num_to_letter = {
         0 : "",
         1 : "",
         2 : "abc",
         3 : "def",
         4 : "ghi",
         5 : "jkl",
         6 : "mno",
         7 : "pqrs",
         8 : "tuv",
         9 : "wxyz"
        }
        if len(digits) == 0:
            return []
        
        results = ['']
        for digit in digits:
            letters = num_to_letter[int(digit)]
            if (len(letters) == 0):
                continue
            else:
                results = [string + letter for string in results for letter in letters]
        return results