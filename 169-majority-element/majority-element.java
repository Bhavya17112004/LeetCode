class Solution {
    public int majorityElement(int[] nums) {
        List<Integer> element = new ArrayList<>();
        List<Integer> count = new ArrayList<>();
        for (int num : nums) {
            if(element.indexOf(num) == -1) {
                element.add(num);
                count.add(1);
            } else {
                int ncount = count.get(element.indexOf(num));
                count.set(element.indexOf(num), ++ncount);
            }
        }
        return element.get(count.indexOf(Collections.max(count)));
    }
}