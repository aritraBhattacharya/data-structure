package recursion.easy;

public class Factorial {
    public static int findFactorial(int n){

        if(n==0 || n==1){
            return 1;
        }
        int fact = n * findFactorial(n-1);
        return fact;
    }

    public static void main(String[] args) {
        int res = Factorial.findFactorial(5);
        System.out.println(res);
    }
}
