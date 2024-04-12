import java.util.ArrayList;
import java.util.List;
public class ArrayListExamples4 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("krishna");
        names.add("manoj");
        names.add("charan");
        names.add("ramesh");
        names.add("balu");
        List<String> uniqueNames = new ArrayList<>();
        for (String name : names) {
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            }

        }
        System.out.println(uniqueNames);
    }
    }


