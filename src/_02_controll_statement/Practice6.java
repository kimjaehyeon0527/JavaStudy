package _02_controll_statement;

public class Practice6 {
    public static void main(String[] args) {
        Practice6 prac = new Practice6();

        System.out.println("반지름이 5 인 원의 넓이 : " + prac.area(5));
        System.out.println("가로 4 세로 7인 직사각형의 넓이 : "  + prac.area(4,7));
        System.out.println("밑변 6, 높이 3인 삼각형의 넓이 : " + prac.area(6.0,3.0));
    }

    public double area (double x) {
        return Math.PI * x * x;
    }

    public int area (int x, int y) {
        return x * y;
    }

    public double area (double a, double b) {
        return (a * b) / 2;
    }
}
