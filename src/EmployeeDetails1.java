import java.util.Arrays;

public class EmployeeDetails1 {
    public static void main(String[] args) {
        String data = "EMP1001,priya,25000000,Hyderabad-EMP1002,Manoj,1000000,DUBAI-EMP1003,UMA,235669677,TANUKU-EMP1004,UMA,235669677,TANUKU-EMP1005,UMA,235669677,TANUKU-EMP1006,UMA,235669677,TANUKU";
        String city = "Hyderabad";
        String[][] arr = new String[data.split("-").length][4];
        int index = 0;
        for (String ele : data.split("-")) {
            arr[index++] = ele.split(",");
        }
        System.out.println(Arrays.deepToString(arr));
    }
    public static void showEmployeeNames(String[][] arr,String city){

    }
}
