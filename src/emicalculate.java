import java.util.Scanner;
public class emicalculate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal loan amount  :");
        double p=sc.nextDouble();
        System.out.println("enter the rate of interest");
        double rate=sc.nextDouble();
        System.out.println("duration of months");
        double n=sc.nextDouble();
        double r=rate/12/100;
        double emi= p*r*(Math.pow(1+r,n)/(Math.pow(1+r,n)-1));
        double totalamount=emi+n;
        double totalintrest=totalamount-p;
        System.out.println("principal amount: " + p);
        System.out.println("rate of amounts: " + rate);
        System.out.println("duration"+n);
        System.out.println("emi amount: " + emi);
        System.out.println("totalamount"+totalamount);
        System.out.println("totalintrst"+totalintrest);


    }
}
