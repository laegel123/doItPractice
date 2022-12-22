package part12_3.collection.solutions.q5;

import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();

        set.add(new Student("100", "이가을"));
        set.add(new Student("200", "나유리"));
        set.add(new Student("300", "최정현"));

        System.out.println(set);
    }
}

class Student {
    private String index;
    private String name;

    public Student(String index, String name) {
        this.index = index;
        this.name = name;
    }

    @Override
    public String toString() {
        return index + ":" + name;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(index);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (student.index == index) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}
