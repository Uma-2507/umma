public class ternaryoperator {
    public static void main(String[] args){
       int num1=10;
       int num2=15;
       int num3=20;
       int big=num1 > num2 && num1 > num3 ? num1: num2>num3 ?num2:num3;
        System.out.println("print biggest number"+big);

    }
}
