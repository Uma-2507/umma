import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadingFileData {
    public static void main(String[] args) {
        try {
            List<String> names = Files.readAllLines(Path.of(ReadingFileData.class.getResource("uma.txt").toURI()));
            String data="";
            for (String name : names) {
                data+=name+",";

            }
            System.out.println(data);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}
