import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n = nums.length;
        int i = 0;

        while (i < n) {
            int start = i;
            // Move `i` until the next number is not consecutive
            while (i + 1 < n && nums[i + 1] == nums[i] + 1) {
                i++;
            }

            if (start == i) {
                // Single number
                result.add(String.valueOf(nums[start]));
            } else {
                // Range from nums[start] to nums[i]
                result.add(nums[start] + "->" + nums[i]);
            }
            i++;
        }

        return result;
    }
}
