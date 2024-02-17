package _05_class._06_abstract._01_Practice2;

public class Circle extends Shape {

    private int radius;

    public Circle(String color, String type, int radius) {
        super(color, type);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }
}
