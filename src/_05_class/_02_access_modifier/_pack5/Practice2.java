package _05_class._02_access_modifier._pack5;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        저장하는 배열 객체
        ArrayList<Rectangle> rect = new ArrayList<>();

        while(true) {
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요. : ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if(a==0 && b==0) {
                break;
            }
            // 객체
            Rectangle rc = new Rectangle(a);
            // 가로, 세로 입력
            rc.setHeight(b);

            // 배열에 저장.
            rect.add(rc);
        }

        for (Rectangle result : rect) {
            System.out.println("가로 길이는 : " + result.getWidth());
            System.out.println("세로 길이는 : " + result.getHeight());
            System.out.println("넓이는 : " + result.area());
            System.out.println("------------------------------");
        }
        System.out.println("Rectangle 인스턴스의 개수는 : " + Rectangle.countIns);

        scanner.close();
    }
}
