package school;

import utils.Define;

import java.util.ArrayList;

public class Subject01 {

    private int id;
    private String name;
    private int gradeType;

    private ArrayList<Student01> student01List = new ArrayList<>();

    public Subject01(int id, String name) {
        this.id = id;
        this.name = name;
        this.gradeType = Define.AB_TYPE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student01> getStudent01List() {
        return student01List;
    }

    public void setStudent01List(ArrayList<Student01> student01List) {
        this.student01List = student01List;
    }
}
