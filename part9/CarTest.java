import java.util.ArrayList;

public class CarTest {
    public static void main(String[] args) {
        ArrayList<Car2> carList = new ArrayList<Car2>();
        carList.add(new Sonata());
        carList.add(new Grandeur());
        carList.add(new Avante());
        carList.add(new Genesis());

        for (Car2 car : carList) {
            car.run();
            System.out.println("================");
        }
    }
}

abstract class Car2 {
    abstract void start();

    abstract void drive();

    abstract void stop();

    abstract void turnOff();

    void washCar() {
        System.out.println("세차를 합니다.");
    }

    void run() {
        start();
        drive();
        stop();
        turnOff();
        washCar();
    }
}

class Sonata extends Car2 {

    @Override
    void start() {
        System.out.println("Sonata 시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("Sonata 달립니다.");
    }

    @Override
    void stop() {
        System.out.println("Sonata 멈춥니다.");
    }

    @Override
    void turnOff() {
        System.out.println("Sonata 시동을 끕니다.");
    }
}

class Grandeur extends Car2 {
    @Override
    void start() {
        System.out.println("Grandeur 시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("Grandeur 달립니다.");
    }

    @Override
    void stop() {
        System.out.println("Grandeur 멈춥니다.");
    }

    @Override
    void turnOff() {
        System.out.println("Grandeur 시동을 끕니다.");
    }
}

class Avante extends Car2 {

    @Override
    void start() {
        System.out.println("Avante 시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("Avante 달립니다.");
    }

    @Override
    void stop() {
        System.out.println("Avante 멈춥니다.");
    }

    @Override
    void turnOff() {
        System.out.println("Avante 시동을 끕니다.");
    }
}

class Genesis extends Car2 {
    @Override
    void start() {
        System.out.println("Genesis 시동을 켭니다.");
    }

    @Override
    void drive() {
        System.out.println("Genesis 달립니다.");
    }

    @Override
    void stop() {
        System.out.println("Genesis 멈춥니다.");
    }

    @Override
    void turnOff() {
        System.out.println("Genesis 시동을 끕니다.");
    }
}
