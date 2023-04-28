package April25;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static java.nio.file.Files.probeContentType;
import static java.nio.file.Files.readAllLines;

public class ReadDataFromFile {
    public static void main(String[] args) throws IOException {
        File file = new File(ReadDataFromFile.class.getResource("/PlayersSt.csv").getFile());
        List<String> lines = Files.readAllLines(file.toPath());
        for(int i=0;i<lines.size();i++){
            System.out.println(lines.get(i));
        }
    }
}
