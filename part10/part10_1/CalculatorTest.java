package part10_1;

public class CalculatorTest {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;

        CompleteCalc calc = new CompleteCalc();
        System.out.println(calc.add(n1, n2));
        System.out.println(calc.substract(n1, n2));
        System.out.println(calc.divide(n1, n2));
        System.out.println(calc.times(n1, n2));
        calc.showInfo();
        calc.description();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));
    }
}
