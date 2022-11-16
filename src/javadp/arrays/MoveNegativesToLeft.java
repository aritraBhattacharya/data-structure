package javadp.arrays;

public class MoveNegativesToLeft {
    public static void move(int[] arr)
    {
        // solution one is to sort the array, but this may change the order
        //Arrays.sort(arr);

        int maxNegIndex = -1;
        int minPosIndex = -1;
        int maxPosIndex = -1;

        for (int i =0;i<arr.length; i++){
            if(arr[i]<0){
                // if element is negative


                // if minPositive is less than i
                if(minPosIndex<i && minPosIndex!=-1){
                    swap(arr,i,minPosIndex);
                    maxNegIndex = minPosIndex;
                    minPosIndex++;
                }
                else{
                    maxNegIndex = i;
                }


            }
            else{ // nothing to do if positive. Just keeping track of max positive element index for logging
                maxPosIndex = i;
                if(minPosIndex==-1){
                    minPosIndex =i;
                }
            }
        }

    }

    private static void swap(int[] arr, int i, int minPosIndex) {
        int temp = arr[i];
        arr[i] =  arr[minPosIndex];
        arr[minPosIndex] =  temp;
    }
}
