package part11_1;

public class NewInstanceTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Person person1 = new Person();
        System.out.println(person1);

        Class pClass = Class.forName("part11_1.Person");
        Person person = (Person) pClass.newInstance();
        System.out.println(person);
    }
}
