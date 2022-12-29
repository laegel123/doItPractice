import report.GenerateGradeReport;
import school.School;
import school.Score01;
import school.Student01;
import school.Subject01;
import utils.Define;

public class TestMain {
    School goodSchool = School.getInstance();
    Subject01 korean;
    Subject01 math;
    GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {
        TestMain test = new TestMain();

        test.createSubject();
        test.createStudent();

        String report = test.gradeReport.getReport();
        System.out.println(report);
    }

    public void createSubject() {
        korean = new Subject01(Define.KOREAN, "국어");
        math = new Subject01(Define.MATH, "수학");

        goodSchool.addSubject(korean);
        goodSchool.addSubject(math);

    }

    public void createStudent() {
        Student01 student1 = new Student01(181213, "이가을", korean);
        Student01 student2 = new Student01(181518, "나유리", math);
        Student01 student3 = new Student01(171230, "최정현", korean);

        goodSchool.addStudent(student1);
        goodSchool.addStudent(student2);
        goodSchool.addStudent(student3);

        korean.register(student1);
        korean.register(student2);
        korean.register(student3);

        math.register(student1);
        math.register(student2);
        math.register(student3);

        addScoreForStudent(student1, korean, 95);
        addScoreForStudent(student1, math, 100);

        addScoreForStudent(student2, korean, 90);
        addScoreForStudent(student2, math, 70);

        addScoreForStudent(student3, korean, 50);
        addScoreForStudent(student3, math, 40);
    }

    public void addScoreForStudent(Student01 student, Subject01 subject, int point) {
        Score01 score = new Score01(student.getId(), subject, point);
        student.addSubjectScore(score);
    }
}
