class Solution(object):
    def distributeCandies(self, candies):
        """
        :type candies: List[int]
        :rtype: int
        """
        # take minimum of half the candies or total unique candies
        return min( len(candies)/2, len(set(candies)) )
