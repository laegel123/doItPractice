package part15_6;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws FileNotFoundException {
        Person personLee = new Person("이가을", "대표이사");
        Person personNa = new Person("나유리", "상무이사");

        FileOutputStream fos = new FileOutputStream("serial.out");
        try (fos) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(personLee);
            oos.writeObject(personNa);
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fis = new FileInputStream("serial.out");
        try (fis) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Person implements Serializable {
    private static final long SerialVersionUID = -1503252402544036183L;
    String name;
    String job;

    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
