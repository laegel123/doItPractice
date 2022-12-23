package part13_3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("이가을");
        stringList.add("나유리");
        stringList.add("최정현");

        Stream<String> stream = stringList.stream();
        stream.forEach(s -> System.out.println(s));
        System.out.println();

        stringList.stream().sorted().forEach(s -> System.out.println(s));
    }
}
