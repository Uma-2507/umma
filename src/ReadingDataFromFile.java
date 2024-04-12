import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadingDataFromFile {
    public static void main(String[] args) throws IOException {
        List<String> lines;
        lines = Files.readAllLines(
                Path.of(ReadingDataFromFile.class.getResource("/names.txt").getPath()));
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
