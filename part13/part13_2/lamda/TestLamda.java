package part13_2.lamda;

public class TestLamda {
    public static void main(String[] args) {
        PrintString lamdaStr = s -> System.out.println(s);
        lamdaStr.showString("hello fall");
        showMyString(lamdaStr, "hello fall");

        PrintString reStr = returnString();
        reStr.showString("hello ");
    }

    public static void showMyString(PrintString printString, String str) {
        printString.showString(str);
    }

    public static PrintString returnString() {
        return s -> System.out.println(s + "fall");
    }
}

// test
interface PrintString {
    void showString(String str);
}
