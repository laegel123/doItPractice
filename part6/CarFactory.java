public class CarFactory {
    private static CarFactory instance = new CarFactory();

    private CarFactory() {}

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }

        return instance;
    }

    public Car createCar() {
        return new Car();
    }

}

class Car {
    static private int CAR_NUM = 1000;
    private int carNum;
    private String carName;

    public Car() {
        CAR_NUM++;
        carNum = CAR_NUM;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarNum() {
        return carNum;
    }

    public String getCarName() {
        return carName;
    }
}
