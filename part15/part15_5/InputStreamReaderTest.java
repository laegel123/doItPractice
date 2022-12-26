package part15_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) throws FileNotFoundException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("reader.txt"));
        try (inputStreamReader) {
            int i;
            while ((i = inputStreamReader.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
