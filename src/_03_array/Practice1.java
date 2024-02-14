package _03_array;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요.");
        int result = 0;
        int[] avg = new int[5];
        for (int i = 0; i<avg.length; i++) {
            avg[i] = sc.nextInt();
            result += avg[i];
        }


        System.out.println("평균은 : " + (double)result/avg.length);

    }
}
