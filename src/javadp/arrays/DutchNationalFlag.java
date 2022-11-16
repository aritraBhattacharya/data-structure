package javadp.arrays;

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
                case 0: // swap mid and low , mid++, low++
                    int temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;
                    low++;
                    mid++;
                    break;
                case 1: // just mid++
                    mid++;
                    break;
                case 2: // swap mid and high  and only high -- as the element at prev high could be 0 and now at mid u may have a 0 after swap
                        // So u cant do mid++
                    int temp2=nums[high];
                    nums[high]=nums[mid];
                    nums[mid]=temp2;
                    high--;
                    break;
            }
        }
    }
    static void sort01(int arr[])
    {
        int low =0; // last index of 0s
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp = arr[low];
                arr[low] = arr[i];
                arr[i]=temp;
                low++;
            }
        }
        for (int j:
             arr) {
            System.out.println(j);
        }

    }

    private static void swap01(int[] arr, int b, int i) {
        int temp = arr[b];
        arr[b] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,1,0,1,0};
        //DutchNationalFlag.sort012(arr,8);
        DutchNationalFlag.sort01(arr);
    }
}
