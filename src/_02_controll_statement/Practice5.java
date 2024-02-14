package _02_controll_statement;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 두 개 입력하세요.");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println("덧셈 결과 : " + add(a,b));
        System.out.println("뺄셈 결과 : " + minues(a,b));
        System.out.println("나눗셈 결과 : " + divide(a,b));
        System.out.println("곱셈 결과 : " + mul(a,b));
    }

    public static double add (double x, double y) {
        return x + y;
    }
    public static double minues (double x, double y) {
        return x - y;
    }
    public static double divide (double x, double y) {
        return x / y;
    }
    public static double mul (double x, double y) {
        return x * y;
    }
}
