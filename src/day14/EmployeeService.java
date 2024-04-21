package day14;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        if (isExists(emp.getEmpno())) {
            System.out.println("Employee with empno " + emp.getEmpno() + " already exists");
        } else {
            employees.add(emp);
        }
    }

    public void removeEmployee(int empno) {
        if (employees.isEmpty()) {
            System.out.println("No employees found");
            return;
        }
        int index = indexOf(empno);
        if (index != -1) {
            employees.remove(index);
            System.out.println("Employee with empno " + empno + " removed successfully");
        } else {
            System.out.println("Employee with empno " + empno + " does not exist");
        }
    }

    public void incrementSalary(int empno, double updatePercentage) {
        int index = indexOf(empno);
        if (index != -1) {
            Employee emp = employees.get(index);
            double updatedSalary = emp.getSalary() + (emp.getSalary() * updatePercentage / 100);
            emp.setSalary(updatedSalary);
        } else {
            System.out.println("Employee with empno " + empno + " does not exist");
        }
    }

    public void showEmployee(int empno) {
        if (employees.isEmpty()) {
            System.out.println("No employees found");
            return;
        }
        int index = indexOf(empno);
        if (index != -1) {
            Employee emp = employees.get(index);
            emp.showInfo();
        } else {
            System.out.println("Employee with empno " + empno + " does not exist");
        }
    }

    public void showAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found");
            return;
        }
        for (Employee emp : employees) {
            emp.showInfo();
            System.out.println("-----------------");
        }
    }

    public void showMaxPaidEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found");
            return;
        }
        List<Employee> maxPaidEmployees = new ArrayList<>();
        double maxSalary = maxSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() == maxSalary) {
                maxPaidEmployees.add(emp);
            }
        }
        for (Employee emp : maxPaidEmployees) {
            emp.showInfo();
            System.out.println("----------------------------------");
        }
    }

    public void showTotalSalaryStats() {
        if (employees.isEmpty()) {
            System.out.println("No employees found");
            return;
        }
        double totalSalary = 0;
        double minSalary = minSalary();
        double maxSalary = maxSalary();
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
        }
        double avgSalary = totalSalary / employees.size();
        System.out.println("Total salary: " + totalSalary);
        System.out.println("Min salary: " + minSalary);
        System.out.println("Max salary: " + maxSalary);
        System.out.println("Average salary: " + avgSalary);
    }
    private double totalSalary(){
        double total=0;
        for(Employee emp: employees){
            total+=emp.getSalary();
        }
        return total;
    }

    public double minSalary() {
        double min = employees.get(0).getSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() < min) {
                min = emp.getSalary();
            }
        }
        return min;
    }

    public double maxSalary() {
        double max = employees.get(0).getSalary();
        for (Employee emp : employees) {
            if (emp.getSalary() > max) {
                max = emp.getSalary();
            }
        }
        return max;
    }

    private int indexOf(int empno) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmpno() == empno) {
                return i;
            }
        }
        return -1;
    }

    private boolean isExists(int empno) {
        for (Employee emp : employees) {
            if (emp.getEmpno() == empno) {
                return true;
            }
        }
        return false;
    }
}
