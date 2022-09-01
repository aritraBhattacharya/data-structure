package arrays;

//Find duplicates in O(n) time and O(1) extra space
/*
*
* Given an array of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number of times. Find these repeating numbers in O(n) and using only constant memory space.

Example:

Input : n = 7 and array[] = {1, 2, 3, 6, 3, 6, 1}
Output: 1, 3, 6

Explanation: The numbers 1 , 3 and 6 appears more
than once in the array.

Input : n = 5 and array[] = {1, 2, 3, 4 ,3}
Output: 3

Explanation: The number 3 appears more than once
in the array.
* */

// HINT: USE INDEX AS THERE WILL BE N ELEMENTS AND MAX ELEMENT CAN BE N-1
//    // when find a number i, flip the number at position i-1 to negative.
//    // if the number at position i-1 is already negative, i is the number that occurs twice.
// remember to use Math.abs as values are changed to negative
//leetcode https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInO1Space {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1] <0){
                duplicates.add(Math.abs(nums[i]));
            }
            else{
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
            }
        }
        return duplicates;
    }
}
