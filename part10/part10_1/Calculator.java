package part10_1;

public abstract class Calculator implements Calc {

    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int substract(int n1, int n2) {
        return n1 - n2;
    }
}
