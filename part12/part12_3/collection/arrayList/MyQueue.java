package part12_3.collection.arrayList;

import java.util.ArrayList;

public class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue() {
        int length = arrayQueue.size();
        if (length == 0) {
            System.out.println("큐가 비었습니다.");
            return null;
        }

        return arrayQueue.remove(0);
    }
}

class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.enQueue("A");
        myQueue.enQueue("B");
        myQueue.enQueue("C");

        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
    }
}
