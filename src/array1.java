public class array1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        for(int i = 0; i <= 2; i++) {
            for(int j = 0; j <= 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Using for each loop");
        for(int[] subArr:arr) {
            for(int ele:subArr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
