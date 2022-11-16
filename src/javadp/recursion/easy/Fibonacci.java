package javadp.recursion.easy;

public class Fibonacci {
    public static int fibRec(int n) {
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else{
            int res = fibRec(n-1)+fibRec(n-2);
            return res;
        }
    }
    public static int fibIterative(int n) {
        if(n==1 || n==2){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        int a0= 1;
        int a1 = 1;
        int sum = 0;
        for (int i=0;i<n-2;i++){
            sum = a0+a1;
            a0=a1;
            a1= sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = Fibonacci.fibRec(3);
        int resultIter = Fibonacci.fibIterative(2);
        System.out.println("recursive res --> "+result);
        System.out.println("iterative res --> "+resultIter);
    }
}
