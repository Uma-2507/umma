import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String data = "java is a programming language and java is a platform java";
        String key = "java";
        String[] arr = data.split(" ");
        int count = 0;
        for (String ele : arr) {
            if (ele.equals(key)) {
                count++;
            }
        }
        System.out.println("The word count of " + key + " is " + count + " times");
    }
}
