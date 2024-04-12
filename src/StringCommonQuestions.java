import java.util.Arrays;
import java.util.Scanner;

public class StringCommonQuestions {
    public static void main(String[] args) {
        String name = "CAT";
        String name2 = "ACT";
        String name3 = "ram";
        System.out.println(isAnagram(name, name2));
        System.out.println(isAnagram("cat", "ACT"));
        char[] arr = name3.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(isPalindrome("MADAM"));
        System.out.println(isPalindrome("MADAMS"));
        System.out.println(countOfWords(new String[]{"java","c","python","java"},"java"));
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    //what is anagram
    //anagram is a word or phrase formed by rearranging the letters of a different word or phrase,typically using all the original letters exactly once.
//ACT->CAT->TAC->ACM  -ACCT
    public static boolean isPalindrome(String str) {// Convert the string to lowercase
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static int countOfWords(String[] arr, String key) {
        int count = 0;
        for (String ele : arr) {
            if (ele.equals(key)) {
                count++;
            }
        }
        return count;
    }
}

