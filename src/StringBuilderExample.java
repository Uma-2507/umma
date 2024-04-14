import java.util.List;

public class StringBuilderExample {
    public static void main(String[] args) {
        Employee emp1=new Employee(1001,"krish",101000,"hyderabad");
        Employee emp2=new Employee(1002,"uma",10004566,"us");
        Employee emp3=new Employee(1003,"krish",1000344,"ufhfhgh");
        Employee emp4=new Employee(1004,"fghhg",1005765664,"hfhdyryr");
        List<Employee> emplist=List.of(emp1,emp2,emp3,emp4);
        String htmlResponse = getHtmlResponse(emplist);
        System.out.println(htmlResponse);
    }

    public static String getHtmlResponse(List<Employee> list){
        String styles= """
                <style>
                table, th, td {
                  border:1px solid black;
                }
                </style>
                """;
        StringBuilder sb=new StringBuilder();
        sb.append("<html>\n");
        sb.append("<head>\n");
        sb.append("<style>\n");
        sb.append("table, th, td {\n");
        sb.append("    border: 1px solid black;\n");
        sb.append("}\n");
        sb.append("</style>\n");
        sb.append("</head>\n");
        sb.append("<body>\n");
        sb.append("<h2>Employee Details</h2>\n");
        sb.append("<table style=\"width:100%\">\n");
        sb.append("<tr>\n");
        sb.append("<th>ID</th>\n");
        sb.append("<th>Name</th>\n");
        sb.append("<th>Salary</th>\n");
        sb.append("<th>Location</th>\n");
        sb.append("</tr>\n");

        for(Employee emp : list) {
            sb.append("<tr>\n");
            sb.append("<td>").append(emp.getEmpno()).append("</td>\n");
            sb.append("<td>").append(emp.getEname()).append("</td>\n");
            sb.append("<td>").append(emp.getSalary()).append("</td>\n");
            sb.append("<td>").append(emp.getLocation()).append("</td>\n");
            sb.append("</tr>\n");
        }

        sb.append("</table>\n");
        sb.append("</body>\n");
        sb.append("</html>\n");
        return sb.toString();
    }
}
