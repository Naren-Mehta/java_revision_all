package leetCode.recursion;

public class ReverseAnArray {
    public static void reverseString(int[] arr, int l, int r){
        System.out.println(l + " "+r);
        if(l>=r){
            return;
        }
        else{
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            reverseString(arr, ++l, --r);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverseString(arr, 0, arr.length-1);

        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
