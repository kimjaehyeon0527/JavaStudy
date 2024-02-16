package _05_class._01_class;

import java.util.Scanner;

public class Rectangle {
    public int width;
    public int height;
    public Rectangle(int a, int b) {

//        this는 매개변수 이름과 필드명이 일치할 때 구분하기 위해서 사용한다.
//        매개변수는 클래스 객체에서 받는 매개변수와 달라도 된다.
        width = a;
        this.height = b;
    }
    public int area() {
        return width * height;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Rectangle rc = new Rectangle(a, b);
        int result = rc.area();

        System.out.println(result);

    }
}
