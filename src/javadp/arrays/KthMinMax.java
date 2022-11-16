package javadp.arrays;




import java.util.TreeSet;

public class KthMinMax {

    public static void fun(){
        TreeSet<Integer> integerTree = new TreeSet<>();
        integerTree.add(1);
        integerTree.add(5);
        integerTree.add(6);
        integerTree.add(2);
        integerTree.add(5);
        integerTree.add(8);
        integerTree.add(4);
        integerTree.add(10);

        integerTree.stream().forEach(x -> {
            System.out.println(x);
        });
    }

    public void quickSortAndKth(int[]arr, int start, int end){
        if(start<end){
            int pivotIndex = findPivot(arr,start,end);
            quickSortAndKth(arr,start,pivotIndex-1);
            quickSortAndKth(arr,pivotIndex+1,end);
        }
    }

    private int findPivot(int[] arr, int start, int end) {

        int pivotElement = arr[end];
        int low = start-1;
        for(int i=start;i<end;i++){
            if(arr[i]<pivotElement){
                low++;
                int temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;
            }
        }
        low++;
        int temp = arr[end];
        arr[end] = arr[low];
        arr[low] = temp;
        return low;

    }

    public static void main(String[] args) {
        KthMinMax kthMinMax = new KthMinMax();
        int[] arr = {1,5,3,7,2,4,0,6,8,9,3};
        int n = arr.length-1;
        kthMinMax.quickSortAndKth(arr,0,n);

       //KthMinMax.fun();
    }
}
