class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
    public void helper(int[] nums, int index, List<Integer> out, List<List<Integer>> ans){
        if (index == nums.length) {
            ans.add(new ArrayList<>(out));
            return;
        }
        helper(nums, index + 1, out, ans);
        out.add(nums[index]);
        helper(nums, index + 1, out, ans);
        out.remove(out.size() - 1);
    }
}