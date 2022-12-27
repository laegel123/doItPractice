package part15_4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("reader.txt");
        try (fileReader) {
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
