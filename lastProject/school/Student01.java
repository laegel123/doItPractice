package school;

import java.util.ArrayList;

public class Student01 {

    private int id;
    private String name;
    private Subject01 majorSubject;

    private ArrayList<Score01> scoreList = new ArrayList<>();

    public Student01(int id, String name, Subject01 majorSubject) {
        this.id = id;
        this.name = name;
        this.majorSubject = majorSubject;
    }

    public void addSubjectScore(Score01 score) {
        scoreList.add(score);
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

    public Subject01 getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject01 majorSubject) {
        this.majorSubject = majorSubject;
    }

    public ArrayList<Score01> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score01> scoreList) {
        this.scoreList = scoreList;
    }
}
