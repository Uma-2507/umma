package day12;

public class Account {
    private String accNumber;
    private String name;
    private double balance;
    private double deposit;
    public Account(String accNumber, String name, double balance){
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;

    }
    public void withdraw(double amount){
        if(amount>0 && amount <=balance){
            balance-=amount;
        }
        else{
            System.out.println("sorry! insufficient funds");
        }
    }
public void showInfo(){
    System.out.println("Account Number :"+accNumber);
    System.out.println("Name :"+name);
    System.out.println("Balance :"+balance);
    }
}
