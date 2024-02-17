package _05_class._06_abstract._01_Practice2;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShapeEx {
    public static void main(String[] args) {
        // Shape -> Circle, Rectangle 의 부모이기 때문에
        // 자바의 다형성 - 하나의 변수가 여러 종류의 객체를 참조할 수 있는 능력.
        ArrayList<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle("Red", "Circle", 5);
        Rectangle rectangle = new Rectangle("Blue", "Rectangle", 15,20);

        shapes.add(circle);
        shapes.add(rectangle);

        for (Shape s : shapes) {
            System.out.println("===== "+ s.getType() + " 도형의 정보 =====");
            System.out.println("도형의 색상 : " + s.getColor());
            System.out.println("도형의 넓이 : " + s.calculateArea());
            System.out.println("\n");
        }


    }
}
