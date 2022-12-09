public class CompleteCalc extends Calculator{
    @Override
    public int times(int number1, int number2) {
        return number1 * number2;
    }

    @Override
    public int divide(int number1, int number2) {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            return Calc.ERROR;
        }
    }

    public void showInfo() {
        System.out.println("Calc 인터페이스를 구현하였습니다.");
    }
}
