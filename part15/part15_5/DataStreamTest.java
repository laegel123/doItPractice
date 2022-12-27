package part15_5;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("data.txt");
        try (fos) {
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeByte(100);
            dos.writeChar('A');
            dos.writeInt(10);
            dos.writeFloat(3.14f);
            dos.writeUTF("Test");
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileInputStream fis = new FileInputStream("data.txt");
        try (fis) {
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
