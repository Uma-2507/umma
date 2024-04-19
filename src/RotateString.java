public class RotateString {
        public static String rotateRight(String str, int n) {
            if (str == null || str.isEmpty()) {
                return str;
            }
            int length = str.length();
            n = n % length; // To handle cases where n is greater than string length
            return str.substring(length - n) + str.substring(0, length - n);
        }

        public static void main(String[] args) {
            String original = "HelloWorld";
            int rotateBy = 3;
            String rotated = rotateRight(original, rotateBy);
            System.out.println("Original: " + original);
            System.out.println("Rotated: " + rotated);
        }
    }

