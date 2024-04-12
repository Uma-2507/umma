import java.util.Scanner;
public class billcalculator {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the bill amount");
        double amount=sc.nextDouble();
        System.out.println("enter the customer type(r-regular/p-premium)");
        String type=sc.next();
        double discount=0;
        if(type.equals("p")|| amount >=1000){
            discount=amount*0.1;
        }
        else{
            discount=amount*0.05;
        }
        System.out.println("the bill amount is :"+amount);
        System.out.println("the customer type is :"+type );
        System.out.println("the discount amount is"+discount);
    }
}
