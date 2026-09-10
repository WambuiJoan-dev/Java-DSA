public class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new Hashset<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(nums);
        }
        return false;
    }
}