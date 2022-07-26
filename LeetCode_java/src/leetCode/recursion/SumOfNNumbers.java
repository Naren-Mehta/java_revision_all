package leetCode.recursion;

public class SumOfNNumbers {

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return  n+sum(n-1);
    }
    public static void main(String[] args) {
        int result = sum(7);
        System.out.println(result);
    }
}
