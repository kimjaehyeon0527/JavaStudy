package _05_class._02_access_modifier;

import java.util.ArrayList;
import java.util.Scanner;

public class ExRectangle02 {
    // 필드 (변수)
    private int width;
    private int height;

    public ExRectangle02(int width) {
        // 지역 변수와 필드 변수명이 동일하기 때문에 this 를 사용해서 필드 값에 접근
        this.width = width;
    }

    public int area() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        // Rectangle 객체를 담는 ArrayList 생성
        ArrayList<ExRectangle02> rectangles = new ArrayList<>();

        // 사용자에게 안내 메시지 출력
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("사각형의 가로와 세로 길이를 입력해주세요 : ");
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            // 0 이 입력되면 종료
            if (width == 0 && height == 0) {
                break;
            }

            ExRectangle02 rectangle = new ExRectangle02(width);
            // 세로 길이 설정
            rectangle.setHeight(height);

            // ArrayList 에 Rectangle 객체 추가
            rectangles.add(rectangle);
        }

        // 입력된 Rectangle 객체들의 정보 출력
        System.out.println("\n 입력된 rectangle 정보");

        for (ExRectangle02 rectangle : rectangles) {
            System.out.println("가로 길이는: " + rectangle.getWidth());
            System.out.println("세로 길이는: " + rectangle.getHeight());
            System.out.println("넓이는: " + rectangle.area());
            System.out.println("-------------------------");
        }

        scanner.close();
    }
}