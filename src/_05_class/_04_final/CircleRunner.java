package _05_class._04_final;

import java.util.Scanner;

public class CircleRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("원의 반지름을 입력하세요. : ");
        int r = scanner.nextInt();
        System.out.println("원의 반지름 : " + r);

        Circle cc = new Circle(r);
        System.out.println("원의 넓이 : " + cc.calculateArea());
    }
}
