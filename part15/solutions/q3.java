package solutions;

import java.io.*;

public class q3 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        try (fos; osw) {
            osw.write("지금까지 자바 정말 재밌게 공부했어요^^");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
