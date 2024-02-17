package _05_class._06_abstract._01_Practice2;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(String color, String type, int width, int height) {
        super(color, type);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}
