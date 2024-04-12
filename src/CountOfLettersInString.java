public class CountOfLettersInString {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            vowels = switch (ch) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> vowels + 1;
                default -> vowels;
            };
        }

        System.out.println("vowels count in the string " + vowels);
    }
}
