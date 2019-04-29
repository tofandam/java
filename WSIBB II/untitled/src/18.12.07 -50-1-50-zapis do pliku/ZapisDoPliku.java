import java.io.IOException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ZapisDoPliku {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("info.txt");
        int a = 1;
        for (int i = 0; i < 100; i++) {

            a = a + 1;
            fileWriter.write(a + ". elo" +
                    "\n");
        }


        fileWriter.close();

        List<String> allLines = Files.readAllLines(Paths.get("info.txt"));
        allLines.add("dsdsdsds");
        System.out.println(allLines.get(allLines.size() - 1));

    }
}
