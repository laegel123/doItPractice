package part13_3.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ReduceTest {
    public static void main(String[] args) {
        String[] persons = {"이가을입니다~", "안녕하세요 ! 나유리예요", "안녕~ 최정현이야"};
        System.out.println(Arrays.stream(persons).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length) {
                return s1;
            } else {
                return s2;
            }
        }));

        String str = Arrays.stream(persons).reduce(new CompareString()).get();
        System.out.println(str);
    }
}

class CompareString implements BinaryOperator<String> {
    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) {
            return s1;
        } else {
            return s2;
        }
    }
}
