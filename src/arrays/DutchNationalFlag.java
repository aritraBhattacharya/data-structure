package arrays;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DutchNationalFlag {
    static void sort012(int nums[], int arr_size)
    {
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high)
        {
            switch(nums[mid])
            {
                case 0:
                    int temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2=nums[high];
                    nums[high]=nums[mid];
                    nums[mid]=temp2;
                    high--;
                    break;
            }
        }
    }
    static void sort01(int arr[], int arr_size)
    {
        int a = 0;
        int b = 0;
        for (int i =0;i<arr.length;i++){
            if(arr[i]==0){
                if(b<i){
                    swap01(arr,b,i);
                    a=b;
                    b++;
                }
                else{
                    a++;
                }
            }
            else{ //arr[i]= 1


            }
        }
    }

//    public int[] twoSum(int[] nums, int target) {
//    Map<Integer,Integer> map = new HashMap<>();
//    int[] result = new int[2];
//    for (int i=0;i<nums.length;i++) {
//        if (map.get(target - nums[i]) == null) {
//            map.put(nums[i],i );
//        } else {
//           result[0] = map.get(target - nums[i]);
//           result[1] =i;
//           break;
//        }
//    }
//    return result;
//}
    private static void swap01(int[] arr, int b, int i) {
        int temp = arr[b];
        arr[b] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {};
        DutchNationalFlag.sort012(arr,8);
    }
}
