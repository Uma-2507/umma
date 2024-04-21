package day12;

public class PassByValueAndReference {

    // Method to swap two elements in an array
    public static void swap(int[] arr) {
        if (arr.length >= 2) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        System.out.println("Before swapping a = " + a + ", b = " + b);

        // Since Java is pass-by-value, you can't actually swap `a` and `b` by a method.
        // To swap them manually:
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping a = " + a + ", b = " + b);

        // Example with an array
        int[] arr = {10, 20};
        System.out.println("Before swapping arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);

        swap(arr);

        System.out.println("After swapping arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
    }
}
