public class StringClassMethods {
    public static void main(String[] args) {
        String name="krish T ";
        name=name.trim();
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name);
        String names="Krish,Manoj,Charan,Rajesh";
        String[] arr=names.split(",");
        for(String ele : arr){
            System.out.println(ele.substring(0, 5).toUpperCase());
        }
        String s1="core java";
        System.out.println(s1.substring(0,4));
        System.out.println(s1.substring( 4));
    }
}
