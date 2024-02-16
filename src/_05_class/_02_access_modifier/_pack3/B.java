package _05_class._02_access_modifier._pack3;

public class B {
    public void method() {
        A a = new A(); // _pack3.A 와 _pack3.B 서로 같은 패키지

        // 필드 변경
        a.field1 = 11; // o
        a.field2 = 22; // o
//        a.filed3 = 33; // x : private field 이기 때문에 컴파일 에러

        // 메소드 호출
        a.method1(); // o
        a.method2(); // o
//        a.method3(); // x : private 이기 때문에 컴파일 에러
    }
}
