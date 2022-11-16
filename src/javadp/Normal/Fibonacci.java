package javadp.Normal;

public class Fibonacci {

    public static int fibonacciRecursive(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
        }
    }
    public static int fibonacciIterative(int n){
        int i0=0;
        int i1=1;

        if(n==0 || n==1) return 1;
        else{
            int res =0;
            while(n-2>0){
                res = i0+i1;
                i0=i1;
                i1=res;
            }
            return res;
        }

    }
}
