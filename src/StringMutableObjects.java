public class StringMutableObjects {
    public static void main(String[] args) {
        String empno="`10001";
        String empname="uma";
        String salary="10000";
        String deptno="101";
       StringBuilder sb = new StringBuilder();
       sb.append(empno).
               append(",").
               append(empname).
               append(",").
               append(salary).
               append(",").
               append(deptno);
        System.out.println(sb.toString());
    }
}
