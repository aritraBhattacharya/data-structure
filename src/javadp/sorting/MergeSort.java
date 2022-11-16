package javadp.sorting;

public class MergeSort {

    public void mergeSort(int[]a, int left, int right){

        if(left<right){
            mergeSort(a,left,(left+right)/2);
            mergeSort(a,((left+right)/2)+1,right);
            merge(a,left,(left+right)/2,right);
        }

    }

    private static void merge(int[] a, int left, int mid, int right) {
        int leftArraySize = mid-left+1;
        int rightArraySize = right-mid;

        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        for(int i=0;i<leftArraySize;i++){
            leftArray[i] = a[i];
        }

        for(int j=mid+1;j<rightArraySize;j++){
            rightArray[j] = a[j];
        }

        int m=0;
        int n=0;
        int k=left;

//        int i = 0, j = 0;
//
//        // Initial index of merged subarray array
//        int k = l;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                arr[k] = L[i];
//                i++;
//            }
//            else {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        /* Copy remaining elements of L[] if any */
//        while (i < n1) {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        /* Copy remaining elements of R[] if any */
//        while (j < n2) {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }


    }

    public static void main(String[] args) {

    }
}
