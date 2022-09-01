package arrays;

public class LargestSumSubArray {

    /*There are 3 possibility
    * 1. Array contains -VE and +Ve
    * 2. Only -Ve --> need to pick the smallest element
    * 3  -ve and 0s --> need to pick 0
    *
    * 4. for 2 and 3 --> where no positive element is present, we need to pick the largest element as the largest sum
    * */
    public int maxSubArray(int[] nums) {
        int maxSum =0;
        int tempSum =0;
        int maxElement= Integer.MIN_VALUE;

        boolean doesArrayContainAnyPositiveElement = false;

        for (int i=0;i<nums.length;i++){

            //---------- for point number 4 : arrays have only -ve or -ve and 0s ---------------
            if(nums[i]>maxElement){
                maxElement=nums[i];
            }

            if(nums[i]>0){
                doesArrayContainAnyPositiveElement = true;
            }
            //-----------------------------------------------------------------------


            tempSum+=nums[i];
            if(tempSum>maxSum){
                maxSum = tempSum;
            }
            else if(tempSum<0){
                tempSum =0;
            }
        }

        if(doesArrayContainAnyPositiveElement) {
            return maxSum;
        }
        else{
            return maxElement;
        }
    }

    /*approach:
    * 1. Traverse and keep on adding.
    * 2. For each index, see what's the sum
    *       > If the sum has increased at the point --> maxSum = SumAtThatIndex
    *       > If sum has reduced after adding a[i], but still  SumAtThatIndex>0 , then we wont do anything but keep on adding
    *       > If at some point SumAtThatIndex becomes negative, that means that particular subarray wont contribute to the largest sum as it will rather reduce the total sum*/
}
