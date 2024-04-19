import java.util.List;

public class PalindromeCount {
    public static void printPalindromeWords(List<String> stringList) {
        for (String str : stringList) {
            if (isPalindrome(str)) {
                System.out.println(str);
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("radar", "level", "hello", "world", "civic");
        System.out.println("Palindrome words:");
        printPalindromeWords(stringList);
    }
}
