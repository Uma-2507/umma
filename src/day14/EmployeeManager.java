package day14;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee emp = new Employee(1001,"krish",4500000);
        Employee emp1=new Employee(1002,"uma",96577664);
        emp.showInfo();
        System.out.println("---------------------------------");
        emp1.showInfo();
    }
}
