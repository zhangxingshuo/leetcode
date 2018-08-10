class Solution:
    def findDuplicate(self, paths):
        """
        :type paths: List[str]
        :rtype: List[List[str]]
        """
        content_path = {}
        for string in paths:
            data = string.split(" ")
            directory = data[0]
            for file in data[1:]:
                index = file.index("(")
                filename = file[:index]
                content = file[index:]
                if content in content_path:
                    content_path[content].append(directory + "/" + filename)
                else:
                    content_path[content] = [directory + "/" + filename]

        results = []
        for key, value in content_path.items():
            if len(value) > 1:
                results.append(value)
        return results