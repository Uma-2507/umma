package day12;
class Book{
    private String name;
    private String author;
    private double price;

    Book(String name, String author, double price){
        this.name="java";
        this.author="uma";
        this.price=8099;
    }

    public void showBookInfo() {
        System.out.println("Name :" +name);
        System.out.println("Author :" +author);
        System.out.println("Price :" +price);
    }
    }

public class ConstructorExample {
    public static void main(String[] args) {
        Book book1 = new Book("java","krish",4555);
        Book book2 = new Book("python","manoj",4555);
        Book book3 = new Book("c","john",4555);
        book1.showBookInfo();
        book2.showBookInfo();
        book3.showBookInfo();
    }
}
