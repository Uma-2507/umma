package day14;

public class ParseAndTypeCasting {
    public static void main(String[] args) {
        String data="1001,Manoj,5.8,Developer,3000000000";
        String[] arr=data.split(",");
        int empno=Integer.parseInt(arr[0]);
        String name=arr[1];
        double height=Double.parseDouble(arr[2]);
        String desg=arr[3];
        double salary=Double.parseDouble(arr[4]);
        System.out.println("empno :"+empno);
        System.out.println("name :"+name);
        System.out.println("height :"+height);
        System.out.println("desg :"+desg);
        System.out.println("salary :"+salary);
        int num=15;
        System.out.println(Integer.toBinaryString(num));
        System.out.println("Byte "+Byte.MIN_VALUE+" :"+Byte.MIN_VALUE);
        System.out.println("Short "+Short.MIN_VALUE+" :"+Short.MIN_VALUE);
        System.out.println("Integer "+Integer.MIN_VALUE+" :"+Integer.MIN_VALUE);
        System.out.println("Long "+Long.MIN_VALUE+" :"+Long.MIN_VALUE);
        System.out.println("Float "+Float.MIN_VALUE+":"+Float.MIN_VALUE);
        System.out.println("Double "+Double.MIN_VALUE+":"+Double.MIN_VALUE);
        System.out.println("Character "+Character.MIN_VALUE+":"+Character.MIN_VALUE);
        System.out.println("Boolean "+Boolean.TRUE+":"+Boolean.FALSE);
        //typecasting
        // converting one type into another type casting
        //1. implicit type casting(widening)
        //2. explicit type casting(narrowing)

        // implicit type casting(widening)
        int a=10;
        float b=a;
        System.out.println(a);
        System.out.println(b);
        //explicit type casting(widening)
        float c=10.99f;
        int d=(int)c;
        System.out.println(c);
        System.out.println(d);
    }

}
