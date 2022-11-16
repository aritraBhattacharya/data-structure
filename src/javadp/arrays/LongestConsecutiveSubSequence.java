package javadp.arrays;

import java.util.Arrays;

public class LongestConsecutiveSubSequence {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return nums.length;
        }
        Arrays.sort(nums);
        return new LongestConsecutiveSubArray().longestConsecutiveSubArray(nums);
    }

    public static void main(String[] args) {
        LongestConsecutiveSubSequence obj = new LongestConsecutiveSubSequence();
        int[]ip = {1,2,0,1};
        System.out.println("Result --> "+obj.longestConsecutive(ip));
    }
}
