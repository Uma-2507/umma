import java.util.*;

    public class FindUniqueNames {
        public static String findUniqueNames(List<List<String>> lists) {
            List<String> uniqueNames = new ArrayList<>();
            for (List<String> list : lists) {
                for (String name : list) {
                    if (!uniqueNames.contains(name)) {
                        uniqueNames.add(name);
                    }
                }
            }
            return String.join(", ", uniqueNames);
        }

        public static void main(String[] args) {
            List<List<String>> lists = new ArrayList<>();
            lists.add(Arrays.asList("Alice", "Bob", "Alice", "Charlie"));
            lists.add(Arrays.asList("David", "Bob", "Charlie", "Eve"));

            String uniqueNames = findUniqueNames(lists);
            System.out.println("Unique names: " + uniqueNames);
        }
    }


