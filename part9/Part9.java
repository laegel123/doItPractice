public class Part9 {
    public static void main(String[] args) {
        System.out.println("=== 자율 주행하는 자동차 ===");
        Car9 myCar = new AICar();
        myCar.run();

        System.out.println("=== 사람이 운전하는 자동차 ===");
        Car9 hisCar = new ManualCar();
        hisCar.run();
    }
}

abstract class Car9 {
    public abstract void drive();

    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다");
    }

    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }

}

class AICar extends Car9 {

    @Override
    public void drive() {
        System.out.println("자율 주행합니다.");
        System.out.println("자동차가 알아서 방향을 전환합니다.");
    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춥니다.");
    }
}

class ManualCar extends Car9 {

    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크로 정지합니다.");
    }
}
