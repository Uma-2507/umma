package day12;
public class RecursionExample {
    // Recursive factorial method
    public int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
    // Recursive GCD (Greatest Common Divisor) method using the Euclidean algorithm
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Recursive Fibonacci method to get the nth Fibonacci number
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    // Recursive method to reverse a string
   // Recursively, it returns reverseString("ello") + 'h'.
    public String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        RecursionExample example = new RecursionExample();
        System.out.println("Factorial of 5: " + example.factorial(5));
        System.out.println("GCD of 48 and 18: " + example.gcd(48, 18));
        System.out.println("Fibonacci number at position 7: " + example.fibonacci(7));
        System.out.println("Reversed string of 'hello': " + example.reverseString("hello"));
    }
}
