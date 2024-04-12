public class ImmutableObjects {
    public static void main(String[] args) {
        String name1="Krish";
        String name2="Krish";
        name1=name1.concat("na");
        System.out.println(name1);
        System.out.println(name2);
        String s1="core";
        String s2="core java";
        String s3=s1.concat("java");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);


    }
}
