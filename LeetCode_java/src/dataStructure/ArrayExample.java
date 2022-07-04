package dataStructure;

public class ArrayExample {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i : arr) {
            System.out.println(arr[i]);
        }

        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        arr1[5] = 100;
        System.out.println(arr1.length);

    }
}
