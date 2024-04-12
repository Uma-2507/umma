class MyArray {
    private int[] arr;
    int count;

    public MyArray(int size){
        arr = new int[size];
    }

    public void add(int ele) {
        arr[count++] = ele;
    }

    public void showElements(){
        if(count == 0){
            System.out.println("[]");
        } else {
            StringBuilder sb = new StringBuilder("[");
            for(int i = 0; i < count - 1; i++){
                sb.append(arr[i]).append(",");
            }
            sb.append(arr[count - 1]).append("]");
            System.out.println(sb.toString()); // corrected here
        }
    }
}

public class array4 {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(3);
        myArray.add(100);
        myArray.add(200);
        myArray.add(300);
        myArray.showElements();
    }
}

