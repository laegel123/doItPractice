package part11_1;

class Student {
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentId + "," + studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            if (this.studentId == std.studentId && this.studentName.equals(std.studentName)) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}

public class EqualTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이가을");
        Student studentLee2 = studentLee;
        Student studentLee3 = new Student(100, "이가을");

        if (studentLee == studentLee2) {
            System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
        } else {
            System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
        }

        if (studentLee.equals(studentLee2)) {
            System.out.println("studentLee와 studentLee2 동일합니다.");
        } else {
            System.out.println("studentLee와 studentLee2 동일하지 않습니다.");
        }

        if (studentLee == studentLee3) {
            System.out.println("studentLee와 studentLee3 주소는 같습니다.");
        } else {
            System.out.println("studentLee와 studentLee3 주소는 다릅니다.");
        }

        if (studentLee.equals(studentLee3)) {
            System.out.println("studentLee와 studentLee3 동일합니다.");
        } else {
            System.out.println("studentLee와 studentLee3 동일하지 않습니다.");
        }
    }
}
