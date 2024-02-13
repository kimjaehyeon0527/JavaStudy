package _01_basic_syntax;

// 형변환
// - 데이터 타입을 변환하는 것
// - (type)var
// - type: 데이터 유형
// - var: 변수 이름

public class Casting {
    public static void main(String[] args) {
        // 묵시적 형변환 (wider Conversion)
        // - 더 작은 타입에서 더 큰 타입으로의 자동 형변환
        // - 반대의 경우에는 묵시적 형변환 X -> 명시적으로 변환해야 함.
        int smallNumber = 10;
        double bigNumber = smallNumber; // int를 double로 자동 형변환

        System.out.println("small : " + smallNumber );
        System.out.println("big : " + bigNumber);

        ///////////////////////
        // 명시적 형변환 (narrow Conversion)
        // - 더 큰 타입에서 더 작은 타입으로 강제 형변환
        double anotherBig = 20.5;
        int anotherSmall = (int)anotherBig; // double 을 int 로 강제 형변환.

        System.out.println("anotherSmall : " + anotherSmall);
        System.out.println("anotherBig : " + anotherBig);

        // 데이터 손실이 발생 할 수 있는 경우 주의해야 함.
        int largeNumber = 1000;
        byte smallByte = (byte) largeNumber;

        System.out.println("largeNumber : " + largeNumber);
//        너무 큰 차이가 있을 땐 주의해야한다. byte의 범위는 2의 7승 -1 까지 이기 때문
        System.out.println("smallByte : " + smallByte);
    }
}
