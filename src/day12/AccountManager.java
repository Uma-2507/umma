package day12;

public class AccountManager {
    public static void main(String[] args) {
        Account acc1=new Account("ACC123","KRISH",1000000);
        Account acc2=new Account("ACC124","KRISH",1000000);
        acc1.showInfo();
        System.out.println("-------------------------------------");
        acc2.showInfo();
        acc1.withdraw(500000);
        acc1.showInfo();
        System.out.println("-------------------------------------");
        acc2.withdraw(100000);
        acc2.showInfo();
    }
}
