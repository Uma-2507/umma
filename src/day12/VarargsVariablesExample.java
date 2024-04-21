package day12;

public class VarargsVariablesExample {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add a variable number of integers (varargs)
    public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        VarargsVariablesExample obj = new VarargsVariablesExample();

        // Add two integers
        System.out.println(obj.add(10, 20)); // Output: 30

        // Add three integers
        System.out.println(obj.add(10, 20, 30)); // Output: 60

        // Add a variable number of integers
        System.out.println(obj.add(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)); // Output: 550
    }
}
