package javadp.arrays;

public class RotateArray{
    public static void rotate(int[] nums, int k) {
        int actualNumberOfRotation  = k%nums.length;
        k=actualNumberOfRotation;
        // if you rotate an array of 3 elements 4 times, then after 3 rotations it will come back to its original form and only one rotation will happen extra
        printArrayElements(nums);
        if(actualNumberOfRotation!=0) {
            // reverse sub-array from 0 to n-k (index 0 - n-k-1)and n-k+1 to n (index n-k to n-1)
            reverseArray(nums,0,nums.length-k-1);
            reverseArray(nums,nums.length-k,nums.length-1);

            //then reverse the whole array
            reverseArray(nums,0,nums.length-1);
        }

    }
    private static void reverseArray(int[]arr,int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static String printArrayElements(int[] nums){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            stringBuilder.append(nums[i]);
            if(i<nums.length-1){
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        RotateArray.rotate(new int[]{1, 2},3);
    }
}
