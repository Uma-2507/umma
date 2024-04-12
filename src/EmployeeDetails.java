public class EmployeeDetails {
    public static void main(String[] args) {
        String data="EMP1001,priya,25000000,Hyderabad-EMP1002,Manoj,1000000,DUBAI-EMP1003,UMA,235669677,TANUKU-EMP1004,UMA,235669677,TANUKU-EMP100,UMA,235669677,TANUKU-EMP1006,UMA,235669677,TANUKU";
        String city="Hyderabad";
        String[][] arr=new String[data.split("-").length][4];
        int index=0;
        for(String ele:data.split("-")){
            arr[index++]=ele.split(",");
        }
        showEmployeeNames(arr,city);

    }
    public static void showEmployeeNames(String[][] arr,String city){
        for(String[] emp: arr){
            if(emp[3].equalsIgnoreCase(city)){
                System.out.println(emp[1]);
            }
        }
    }

    private static void showEmployeeNames(String[][] arr) {
        for(String[] emp:arr){
            System.out.println("ID   " + emp[0] );
            System.out.println("name " + emp[1] );
            System.out.println("salary " + emp[2] );
            System.out.println("city " + emp[3] );
            System.out.println("_".repeat(100));

        }
    }
}
