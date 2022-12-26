package part15_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
    public static void main(String[] args) throws FileNotFoundException {
        long millisecond = 0;
        FileInputStream fis = new FileInputStream("a.zip");
        try (fis) {
            FileOutputStream fos = new FileOutputStream("copy.zip");
            millisecond = System.currentTimeMillis();
            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("파일을 복사하는 데 걸린 시간 : " + millisecond + "millisecond 초");
    }
}
