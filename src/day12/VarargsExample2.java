package day12;

public class VarargsExample2 {
    public void format(String... arr) {
        String data = "";
        int i = 1;
        for (String ele : arr) {
            data += i + ")" + ele + "\n";
            i++;
        }
            System.out.println(data);
        }
        public void format(String name1, String name2){
            System.out.println("names are:");
            System.out.println("1)"+name1);
            System.out.println("2)"+name2);
        }


    public static void main(String[] args) {
        VarargsExample2 obj=new VarargsExample2();
        obj.format("krish","manoj","uma");
        obj.format("uma");
        obj.format("krish","manoj","mgha","ghsut","ghutwaaggg","yuejahf");
    }
}
