package day12;

public class StaticMethodExample {
    public void showGreetings(String name){
        if(name==null || name.isEmpty()){
            name="Guest";
        }
        System.out.println("hello"+name+",good morning");
    }

    public static void main(String[] args) {
        StaticMethodExample obj=new StaticMethodExample();
        obj.showGreetings("krish");
    }
}
