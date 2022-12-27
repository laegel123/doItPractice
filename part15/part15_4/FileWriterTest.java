package part15_4;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("writer.txt");
        try (fileWriter) {
            fileWriter.write('A');
            char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};

            fileWriter.write(buf);
            fileWriter.write("안녕하세요.");
            fileWriter.write(buf, 1, 2);
            fileWriter.write("65");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("출력이 완료되었습니다.");
    }
}
