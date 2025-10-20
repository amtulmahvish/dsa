
class Solution {

    public int sumOfFirstAndLast(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        int first = nums[0];

        int last = nums[nums.length - 1];

        return first + last;
    }
}
