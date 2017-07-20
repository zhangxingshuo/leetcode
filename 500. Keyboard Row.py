def type_one_row(string):
    string = string.lower()
    first_row = ['q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p']
    second_row = ['a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l']
    third_row = ['z', 'x', 'c', 'v', 'b', 'n', 'm']
    
    row = None
    if string[0] in first_row:
        row = first_row
    elif string[0] in second_row:
        row = second_row
    elif string[0] in third_row:
        row = third_row
        
    for char in string:
        if char not in row:
            return False
    return True

class Solution(object):
        
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        return [word for word in words if type_one_row(word)]