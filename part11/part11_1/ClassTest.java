package part11_1;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class pClass1 = person.getClass();
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("part11_1.Person");
        System.out.println(pClass3.getName());

        Constructor[] cons = pClass1.getConstructors();
        for (Constructor c : cons) {
            System.out.println(c);
        }

        System.out.println();
        Field[] fields = pClass1.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println();
        Method[] methods = pClass1.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
