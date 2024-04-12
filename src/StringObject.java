public class StringObject {
        public static void main(String[] args) {
            String name1="Krish";
            String name2=new String("krish");
            String name3=new String (new char[]{'k','r','i','s','h'});
            System.out.println(name1);
            System.out.println(name2);
            System.out.println(name3);
            System.out.println(name1.equals(name2));
            System.out.println(name2.equals(name3));
        }
    }

