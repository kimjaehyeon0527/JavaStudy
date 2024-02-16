package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      num 배열 객체 생성
        ArrayList<Integer> num = new ArrayList<>();
        int sum = 0;

        try {
            System.out.println("배열의 크기를 입력해주세요 : ");
            int numSize = sc.nextInt();
            // 정수 입력 시 : InputMismatchException
            if (numSize <= 0) {
                throw new IllegalArgumentException("배열 크기는 1 이상이어야 합니다.");
            }
            // 0 입력 시 : ArithmeticException

            System.out.println(numSize + "개의 수를 입력해주세요 :");
            for (int i = 0; i < numSize; i++) {
                int inputData = sc.nextInt();
                num.add(inputData);
                sum += inputData;
            }
            int result = sum/numSize;

            System.out.println("배열 요소 평균 : " + result);
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력해주세요.");
        } catch (ArithmeticException e) {
            System.out.println("0 이외의 숫자를 입력해주세요.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
