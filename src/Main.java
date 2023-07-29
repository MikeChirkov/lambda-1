public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        calc.printInteger.accept(a);
        int b = calc.minus.apply(1, 1);
        calc.printInteger.accept(b);
        int c = calc.divide.apply(a, b);

        calc.printInteger.accept(c);

        boolean d = calc.isPositive.test(a);

        calc.printBoolean.accept(d);

        int e = calc.multiply.apply(2, 2);

        calc.printInteger.accept(e);
    }
}