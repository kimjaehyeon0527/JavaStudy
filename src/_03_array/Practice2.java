package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> content = new ArrayList<>();

        if(sc.equals("exit")) {
            for (String s : content) {
                System.out.println(s);
            }
        } else {
            System.out.println("문자를 입력해주세요. : ");
            content.add(sc.next());
        }
        while(){

        }
    }
}
