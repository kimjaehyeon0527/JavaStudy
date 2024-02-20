package _07_generic._Practice2;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator<Integer> a = new Calculator<>(5, 3);
        System.out.println("Integer Sum : " + a.add());

        Calculator<Double> b = new Calculator<>(3.231, 8.423);
        System.out.println("Double Sum : " + b.add());
    }
}
