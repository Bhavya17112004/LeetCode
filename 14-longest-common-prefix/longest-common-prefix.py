class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        result = ""
        n = len(min(strs, key=len))
        count = 0
        for i in range(n):
            for j in strs:
                if(strs[0][i] == j[i]):
                    count += 1
            if(count == len(strs)):
                result += strs[0][i]
            else:
                break
            count = 0
        return result