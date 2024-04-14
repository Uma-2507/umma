public class StringWithJSONData {

    public static void main(String[] args) {
        String empJson = "{\n" +
                " \"empno\":10000, \n" +
                " \"empname\":\"Krish\", \n" + // Added comma here
                " \"salary\":45000,\n" +
                " \"deptno\":10000 \n" +
                "}";
        System.out.println(empJson);

        // in another way we can get the correct output
        String empJson1 = """
                {
                "empno":1001,
                "empname":"krish",
                "salary":10000000
                }""";
        System.out.println(empJson1);

        // Call getBlockOfHtml method
        String htmlBlock = getBlockOfHtml();
        System.out.println(htmlBlock);
    }

    public static String getBlockOfHtml(){
        return """
                <html>
                <head>
                <title>Sample page</title>
                </head>
                </html>
                """;
    }
    public static String getTextWithEscapes(){
        return """
            "fun" with
            whitespace
            and other escapes \\"""; // Escape the backslash
    }

}