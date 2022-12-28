package report;

import grade.GradeEvaluation;
import impl.BasicEvaluation;
import impl.MajorEvaluation;
import school.School;
import school.Score01;
import school.Student01;
import school.Subject01;
import utils.Define;

import java.util.ArrayList;

public class GenerateGradeReport {
    School school = School.getInstance();
    public static final String TITLE = " 수강생 학점 \t\t\n";
    public static final String HEADER = " 이름 | 학번 | 필수과목 | 점수 \n";
    public static final String LINE = "--------------------------------\n";

    private StringBuffer buffer = new StringBuffer();

    public String getReport() {
        ArrayList<Subject01> subject01List = school.getSubject01List();

        for (Subject01 subject : subject01List) {
            makeHeader(subject);
            makeHeader(subject);
            makeFooter();
        }

        return buffer.toString();
    }

    public void makeHeader(Subject01 subject) {
        buffer.append(GenerateGradeReport.LINE);
        buffer.append("\t" + subject.getName());
        buffer.append(GenerateGradeReport.TITLE);
        buffer.append(GenerateGradeReport.HEADER);
        buffer.append(GenerateGradeReport.LINE);
    }

    public void makeBody(Subject01 subject) {
        ArrayList<Student01> student01List = subject.getStudent01List();

        for (int i = 0; i < student01List.size(); i++) {
            Student01 student = student01List.get(i);
            buffer.append(student.getName());
            buffer.append(" | ");
            buffer.append(student.getId());
            buffer.append(" | ");
            buffer.append(student.getMajorSubject().getName() + "\t");
            buffer.append(" | ");

            getScoreGrade(student, subject.getId());

            buffer.append("\n");
            buffer.append(LINE);
        }
    }

    public void getScoreGrade(Student01 student, int subjectId) {
        ArrayList<Score01> score01List = student.getScoreList();
        int majorId = student.getMajorSubject().getId();

        GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};

        for (int i = 0; i < score01List.size(); i++) {
            Score01 score = score01List.get(i);
            if (score.getSubject().getId() == subjectId) {
                String grade;
                if (score.getSubject().getId() == majorId) {
                    grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
                } else {
                    grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
                }

                buffer.append(score.getPoint());
                buffer.append(":");
                buffer.append(grade);
                buffer.append(" | ");
            }
        }
    }

    public void makeFooter() {
        buffer.append("\n");
    }
}
