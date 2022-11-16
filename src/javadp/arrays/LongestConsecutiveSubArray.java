package javadp.arrays;

public class LongestConsecutiveSubArray {

    public int longestConsecutiveSubArray(int[] nums) {
        int maxLength = 1;
        int tempMaxLength = 1;
        int start = 0;
        int end = 1;
        while (end <= nums.length - 1) {
            if (nums[start] + 1 == nums[end]) {
                tempMaxLength += 1;
                end++;
                start++;
                if (maxLength < tempMaxLength) {
                    maxLength = tempMaxLength;
                }
            } else if (nums[start] == nums[end]) { // if elements are same that means we can skip those  *************************
                end++;
                start++;
            } else {
                start = end;
                end++;
                tempMaxLength = 1;
            }

        }
        return maxLength;
    }
}
