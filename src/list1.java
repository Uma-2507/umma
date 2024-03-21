import java.util.ArrayList;
import java.util.List;

public class list1 {
    public static void main(String[] args) {
        List<Integer> num1list = new ArrayList<>();
        num1list.add(1);
        num1list.add(2);
        num1list.add(3);
        num1list.add(4);
        num1list.add(5);
        List<Integer> num2list = new ArrayList<>();
        num2list.add(1);
        num2list.add(2);
        num2list.add(3);
        num2list.add(4);
        num2list.add(7);
        List<Integer> commonList = new ArrayList<>();
 for(int ele: num1list) {
     if(num2list.contains(ele)){
         commonList.add(ele);
     }
 }
        System.out.println(commonList);
        System.out.println(commonList.size());
    }
}
