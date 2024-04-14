public class StringWithJSONData2 {
        public static void main(String[] args) {
            // Call the method to generate text with escape characters
            String textWithEscapes = getTextWithEscapes();

            // Printing the text with escapes
            System.out.println(textWithEscapes);
        }

        public static String getTextWithEscapes() {
            // Creating a string with escape characters
            String text1 = """
            This is a string with escape characters: \" for double quotes, \\ for backslashes,
            \n for newline, and \t for tab.
            """;
            return text1;
        }
    // Using text blocks to define a string with escape characters

    }


