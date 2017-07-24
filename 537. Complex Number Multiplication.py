class Solution(object):
    def complexNumberMultiply(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        real_a = int(a[:a.index('+')])
        imag_a = int(a[a.index('+') + 1:-1])
        real_b = int(b[:b.index('+')])
        imag_b = int(b[b.index('+') + 1:-1])
        real_res = real_a * real_b - imag_a * imag_b
        imag_res = real_a * imag_b + imag_a * real_b
        return str(real_res) + "+" + str(imag_res) + "i"