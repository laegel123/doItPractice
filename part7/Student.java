import java.util.ArrayList;

public class Student {
    int studentId;
    String name;
    ArrayList<Subject> subjectList;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);
        subjectList.add(subject);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name + " : " + this.studentId + "\n");
        for (Subject subject : subjectList) {
            sb.append(subject.name + " : " + subject.score + "\n");
        }

        return sb.toString();
    }
}

class Subject {
    String name;
    int score;

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

class Main {
    public static void main(String[] args) {
        Student student01 = new Student(1000, "student01");
        student01.addSubject("과학", 100);
        student01.addSubject("국어", 20);
        Student student02 = new Student(10001, "student02");
        student02.addSubject("과학", 20);
        student02.addSubject("국어", 100);

        System.out.println(student01);
        System.out.println(student02);
    }
}
