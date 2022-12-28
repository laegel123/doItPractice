package school;

import java.util.ArrayList;

public class School {
    private static School instance = new School();

    private static String SCHOOL_NAME = "GOOD SCHOOL";
    private ArrayList<Student01> student01List = new ArrayList<>();
    private ArrayList<Subject01> subject01List = new ArrayList<>();

    private School() {}

    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }

        return instance;
    }

    public ArrayList<Student01> getStudent01List() {
        return student01List;
    }

    public void setStudent01List(ArrayList<Student01> student01List) {
        this.student01List = student01List;
    }

    public ArrayList<Subject01> getSubject01List() {
        return subject01List;
    }

    public void setSubject01List(ArrayList<Subject01> subject01List) {
        this.subject01List = subject01List;
    }
}
