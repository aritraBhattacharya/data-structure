package javadp.searching;

public class BinarySearch {
    public static int doBinarySearch(int[] nums, int target) {

        if(nums.length==0) return -1;

        int start =0;
        int end = nums.length -1;
        int mid = (start+end)/2;
        int result =-1;

        while(start<end){
            if(nums[mid]==target) {
                result = mid;
                break;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

            mid = mid = (start+end)/2;
        }

        return result;

    }

    public static int interpolationSearch(int[] data, int item) {

        int highEnd = (data.length - 1);
        int lowEnd = 0;

        while (item >= data[lowEnd] && item <= data[highEnd] && lowEnd <= highEnd) {

            int probe
                    = lowEnd + (highEnd - lowEnd) * (item - data[lowEnd]) / (data[highEnd] - data[lowEnd]);

            if (highEnd == lowEnd) {
                if (data[lowEnd] == item) {
                    return lowEnd;
                } else {
                    return -1;
                }
            }

            if (data[probe] == item) {
                return probe;
            }

            if (data[probe] < item) {
                lowEnd = probe + 1;
            } else {
                highEnd = probe - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] ip = {-1,0,3,5,9,12};
        Thread t1 = new Thread(() -> System.out.println("Binary search: "+BinarySearch.doBinarySearch(ip,9 )));
        Thread t2 = new Thread(() -> System.out.println("interpolation search: "+ BinarySearch.interpolationSearch(ip,9 )));
        t1.start();
        t2.start();
    }
}
