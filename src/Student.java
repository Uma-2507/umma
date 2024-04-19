import TshirtSize.TshirtSize;

public class Student {
    private int rollno;
    private String name;
    private String email;
    private TshirtSize size; // Corrected field name

    public Student(int rollno, String name, String email, TshirtSize size){ // Corrected parameter name
        this.rollno = rollno;
        this.name = name;
        this.email = email;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", size=" + size +
                '}';
    }
}
