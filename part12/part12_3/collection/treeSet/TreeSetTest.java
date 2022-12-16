package part12_3.collection.treeSet;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("이가을");
        treeSet.add("나유리");
        treeSet.add("최정현");

        for (String str : treeSet) {
            System.out.println(str);
        }
    }
}
