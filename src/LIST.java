import java.util.ArrayList;
import java.util.List;
public class LIST {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("uma");
        list.add("maha");
        list.add("pandu");
        list.add("mahi");
        System.out.println(list);
        System.out.println(list.size());
        list.remove("uma");
        String str = list.toString();
        System.out.println(list.toString());
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("mahi"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String name : list) {
            System.out.println(name);
        }
    }
    }

