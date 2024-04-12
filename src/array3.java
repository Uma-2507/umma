public class array3 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 4, 5, 6};
        int[] arr3 = mergeArrays(arr1, arr2);
        for (int ele : arr3) {
            System.out.print(ele + " ");
        }
    }


    private static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int ele : arr1) {
            arr3[i++] = ele;
        }
        for (int ele : arr2) {
            arr3[i++] = ele;
        }
        return arr3;

    }
}

