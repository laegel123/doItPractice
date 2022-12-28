package school;

public class Score01 {

    int id;
    Subject01 subject;
    int point;

    public Score01(int id, Subject01 subject, int point) {
        this.id = id;
        this.subject = subject;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subject01 getSubject() {
        return subject;
    }

    public void setSubject(Subject01 subject) {
        this.subject = subject;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Score01{" +
                "id=" + id +
                ", subject=" + subject +
                ", point=" + point +
                '}';
    }
}
