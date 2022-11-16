package javadp.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenSum {

    //https://leetcode.com/problems/subarray-sum-equals-k/
    //Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.


    /*SOLUTION
    *
    * For Sum=0: keep on adding elements and store the sum in a hashset. Suppose at index 2,
    * the sum is 7 and again after keeping on adding at index 11 again the sum is 7. so that means from index 3 to 11, the sum of elements were 0.
    https://www.youtube.com/watch?v=8inhayLCCHs&ab_channel=HelloWorld

    For sum =K: Now same thing for Sum = K, but this time we need to check if for a given index (sum-K) already exists in the hashset."
    */
    public static int subarraySum(int[] nums, int k) {
        int sum =0;
        int counter =0;
        Map<Integer,Integer> sumMap = new HashMap<>(); // sum value and their number of occurrence
        sumMap.put(0,1);

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sumMap.get(sum-k)!=null){
                counter+=sumMap.get(sum-k);
            }
            if(sumMap.get(sum)==null){
                sumMap.put(sum,1);
            }
            else{
                int prevOccurrence = sumMap.get(sum);
                prevOccurrence++;
                sumMap.put(sum,prevOccurrence);
            }

        }
        return counter;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(SubArrayWithGivenSum.subarraySum(nums,3));
    }
}
