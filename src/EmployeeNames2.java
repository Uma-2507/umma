public class EmployeeNames2 {
    public static void main(String[] args) {
        String data = "EMP1001,priya,25000000,Hyderabad-EMP1002,Manoj,1000000,DUBAI-EMP1003,UMA,235669677,TANUKU-EMP1004,priya,235669677,TANUKU-EMP1005,UMA,235669677,TANUKU-EMP1006,UMA,45673834,TANUKU";
        String name = "priya";
        String[][] arr = new String[data.split("-").length][4];
        int index = 0;
        for (String ele : data.split("-")) {
            arr[index++] = ele.split(",");
        }
        showEmployeeNames(arr, name);
        // Call the overloaded method to display all employees
        showEmployeeNames(arr);
    }

    public static void showEmployeeNames(String[][] arr, String name) {
        for (String[] emp : arr) {
            if (emp[1].equals(name)) {
                System.out.println(emp[1]);
            }
        }
    }

    private static void showEmployeeNames(String[][] arr) {
        for (String[] emp : arr) {
            if (emp.length >= 4) {
                System.out.println("ID     " + emp[0]);
                System.out.println("Name   " + emp[1]);
                System.out.println("Salary " + emp[2]);
                System.out.println("City   " + emp[3]);
                System.out.println("_".repeat(100));
            }
        }
    }
}
