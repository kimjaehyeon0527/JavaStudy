package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> content = new ArrayList<>();

        while(true) {
            System.out.println("문자를 입력해주세요. : ");

            String text = sc.next();

            if(text.equals("exit")) {
                break;
            }
//            ArrayList에 입력받은 문자열 추가
            content.add(text);
        }
//        ArrayList에 있는 값들 출력
        for (String s : content) {
            System.out.println(s);
        }

        sc.close();
    }
}
