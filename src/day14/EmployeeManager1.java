package day14;

import java.util.Scanner;

public class EmployeeManager1 {
    public static void main(String[] args) {
        EmployeeService ems = new EmployeeService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("------- Menu -----");
            System.out.println("1. Add employee");
            System.out.println("2. Show employee");
            System.out.println("3. Update employee salary");
            System.out.println("4. Remove employee");
            System.out.println("5. Show all employees");
            System.out.println("6. Show max paid employees");
            System.out.println("7. Show salary stats");
            System.out.println("8. Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the empno:");
                    int empno = sc.nextInt();
                    System.out.println("Enter the name:");
                    String name = sc.next();
                    System.out.println("Enter the salary:");
                    double salary = sc.nextDouble();
                    Employee emp = new Employee(empno, name, salary);
                    ems.addEmployee(emp);
                    break;

                case 2:
                    System.out.println("Enter the empno:");
                    int empno2 = sc.nextInt();
                    ems.showEmployee(empno2);
                    break;

                case 3:
                    System.out.println("Enter the empno:");
                    int empno3 = sc.nextInt();
                    System.out.println("Enter the increment percentage:");
                    double increment = sc.nextDouble();
                    ems.incrementSalary(empno3, increment);
                    break;

                case 4:
                    System.out.println("Enter the empno:");
                    int empno4 = sc.nextInt();
                    ems.removeEmployee(empno4);
                    break;

                case 5:
                    ems.showAllEmployees();
                    break;

                case 6:
                    ems.showMaxPaidEmployees();
                    break;

                case 7:
                    ems.showTotalSalaryStats();
                    break;

                case 8:
                    System.out.println("Thanks for using the application");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
