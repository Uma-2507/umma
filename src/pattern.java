public class pattern {
    public static void main(String[] args) {
        int[][] arr=new int[][]{
                {1,1,1,1,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {1,1,1,1,1},
                {1,0,0,0,1},
                {1,0,0,0,1},
                {1,0,0,0,1}
        };
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                int val=arr[i][j];
                if(val==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  "); // Two spaces to maintain proper spacing
                }
            }
            System.out.println();
        }
    }

}
