package leetCode.recursion;

public class FibonacciSeries {

    //Fibonacci Via loop
    public static void fibonacciSeries(int n) {
        int x = 1;
        int y = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(y);
            int temp = x;
            x = x + y;
            y = temp;
        }
    }

    public static int fibonacciSeriesRecursively(int n) {
        if(n <=1){
            return n;
        }


        return  fibonacciSeriesRecursively(n-1) + fibonacciSeriesRecursively(n-2);
    }

    public static void main(String[] args) {
//        System.out.println(fibonacciSeriesRecursively(10));

        for(int i=0;i<10;i++){
            System.out.println(fibonacciSeriesRecursively(i));
        }

        int[] arr = {1,2,3};

        for(int i: arr){
            
        }
    }
}
