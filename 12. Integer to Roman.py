class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        if num == 0: return ''
        elif num > 999:
            return 'M' * (num // 1000) + self.intToRoman(num % 1000)
        elif num > 899:
            return 'CM' + self.intToRoman(num - 900)
        elif num > 499:
            return 'D' + self.intToRoman(num - 500)
        elif num > 399:
            return 'CD' + self.intToRoman(num - 400)
        elif num > 99:
            return 'C' * (num // 100) + self.intToRoman(num % 100)
        elif num > 89:
            return 'XC' + self.intToRoman(num - 90)
        elif num > 49:
            return 'L' + self.intToRoman(num - 50)
        elif num > 39:
            return 'XL' + self.intToRoman(num - 40)
        elif num > 9:
            return 'X' * (num // 10) + self.intToRoman(num % 10)
        elif num > 8:
            return 'IX' + self.intToRoman(num - 9)
        elif num > 4:
            return 'V' + self.intToRoman(num - 5)
        elif num > 3:
            return 'IV' + self.intToRoman(num - 4)
        else:
            return 'I' * num