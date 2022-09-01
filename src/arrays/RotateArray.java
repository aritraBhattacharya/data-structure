package arrays;

public class RotateArray{
    public void rotate(int[] nums, int k) {
        int actualNumberOfRotation  = k%nums.length;
        // if you rotate an array of 3 elements 4 times, then after 3 rotations it will come back to its original form and only one rotation will happen extra
        printArrayElements(nums);
        if(actualNumberOfRotation!=0) {
            for (int i = 0; i < nums.length; i++) {


            }
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
}
