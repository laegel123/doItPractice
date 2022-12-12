package part11_1;

class MyDog {
    String name;
    String type;


    public MyDog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " " + type;
    }
}

public class MyDogTest {
    public static void main(String[] args) {
        MyDog myDog = new MyDog("멍멍이", "진돗개");
        System.out.println(myDog);
    }
}
