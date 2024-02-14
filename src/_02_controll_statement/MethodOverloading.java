package _02_controll_statement;

// 오버로딩
// - 하나의 클래스에서 동일한 이름의 메서드 여러 개 정의
// 즉, 이름이 같고 매개변수가 타입, 개수, 순서가 다름
// - 동작이 유사할 때 사용하면 편리

public class MethodOverloading {
    public static void main(String[] args) {
//        add(1, 2);
//        1. 객체 생성
//        객체란 우리가 만들지 않으면없다. static을 붙이게 되면 클래스안에 스태틱으로 만들어진애의 공간이 미리 생긴다. 객체가 생기기 전에 공간이 미리 생김. 이미 주소를 하나 차지하고 있기 때문에 호출해서 사용 가능. 클래스 안에서 공유할 때는 스태틱을 붙여준다. 스태틱을 붙이면 객체없이도 메서드를 쓸수있다.

        MethodOverloading ol = new MethodOverloading();

//        2. 객체의 메서드 사용
        System.out.println(ol.add(1,2));
        System.out.println(ol.add(1.1,2.2));
        System.out.println(ol.add(1,2,3));
        System.out.println(ol.add(1.1,2.1,3.1));
    }
//    add는 static이 없기 때문에 객체를 만들어서 사용해야한다. 객체가 생성될때 객체의 주소, 자리가 생긴다.
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b, double c) {
        return a + b + c;
    }
}
