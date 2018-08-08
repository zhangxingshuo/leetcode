class Solution:
    def leastBricks(self, wall):
        """
        :type wall: List[List[int]]
        :rtype: int
        """
        d = {}
        for row in wall:
            length = 0
            for brick in row[:-1]:
                length += brick
                if length in d:
                    d[length] += 1
                else:
                    d[length] = 1
        m = max(d.values()) if d else 0
        return len(wall) - m