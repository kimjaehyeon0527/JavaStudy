package _04_exception;

public class Practice1 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};

        try{
            for (int i = 0; i <5 ; i++) {
                System.out.println(num[i]); // ArrayIndexOutOfBoundsException
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 범위를 벗어났습니다.");
        }
    }
}
