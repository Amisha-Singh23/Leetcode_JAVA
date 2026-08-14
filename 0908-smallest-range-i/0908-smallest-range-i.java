class Solution {
    public int smallestRangeI(int[] nums, int k) {

        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[nums.length - 1];

        int score = (max - k) - (min + k);

        return Math.max(0, score);
    }
}