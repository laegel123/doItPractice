package part13_2.lamda;

public class TestStringConcat {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Fall";
        StringConcatImpl stringConcat = new StringConcatImpl();
        stringConcat.makeString(str1, str2);

        StringConcat concat = (s1, s2) -> System.out.println(s1 + ", " + s2);
        concat.makeString(str1, str2);
    }
}

class StringConcatImpl implements StringConcat {

    @Override
    public void makeString(String str1, String str2) {
        System.out.println(str1 + ", " + str2);
    }
}
