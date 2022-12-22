package part12_3.collection.solutions.q6;

import java.util.HashMap;

public class CarTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car sonata1 = factory.createCar("가을 차");
        Car sonata2 = factory.createCar("가을 차");
        System.out.println(sonata1 == sonata2);

        Car avante1 = factory.createCar("유리 차");
        Car avante2 = factory.createCar("유리 차");
        System.out.println(avante1 == avante2);

        System.out.println(sonata1 == avante1);
    }
}

class Car {
    String name;

    public Car() {

    }

    public Car(String name) {
        this.name = name;
    }
}

class CarFactory {
    private static CarFactory instance = new CarFactory();
    private HashMap<String, Car> map = new HashMap<>();

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }
    public Car createCar(String name) {
        if (map.containsKey(name)) {
            return map.get(name);
        }
        Car car = new Car();
        map.put(name, car);
        return car;
    }

}
