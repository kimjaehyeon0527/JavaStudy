package _05_class._04_final;

public class Circle {
    final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public static final double PI = Math.PI;
    public double calculateArea() {
        return radius * radius * PI;
    }
}
