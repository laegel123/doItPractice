package part11_1;

class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyDate) {
            MyDate myDate = (MyDate) obj;
            if (this.day == myDate.day && this.month == myDate.month && this.year == myDate.year) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.year + this.month + this.day;
    }
}

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(9, 18, 2004);
        MyDate date2 = new MyDate(9, 18, 2004);
        System.out.println(date1.equals(date2));
    }
}
