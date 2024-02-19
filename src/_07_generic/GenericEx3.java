package _07_generic;

// 사람 객체간 상속 관계
// Person
// ㄴ Teacher
// ㄴ Student
//    ㄴ WebStudent
//    ㄴ MobileStudent

class Person {

}
class Student extends Person {

}
class Teacher extends Person {

}
class WebStudent extends Student {

}
class MobileStudent extends Student {

}

// 등록
// - 특정 종류 (T)의 Applicant 를 나타내는 클래스
class Applicant<T> {
    public T kind;

    public Applicant(T kind) {
        this.kind = kind;
    }
}

// 과정
class Course {
    // 모든 사람이 등록 가능
    public static void registerCourseA(Applicant<?> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course A를 등록함.");
    }

    // Student 객체만 등록 가능
    public static void registerCourseB(Applicant<? extends Student> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course B를 등록함.");
    }

    // Teacher 가능, Student 가 아닌 Person 만 등록 가능
    public static void registerCourseC(Applicant<? super Teacher> applicant) {
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course C를 등록함.");
    }

    // 참고, getClass(), getSimpleName() 메소드
    // - object 클래스에서 제공되는 메소드
    // - getClass() : 객체 클래스 정보를 반환, 반환 값은 클래스 객체 (ex, class java.lang.String)
    // - getSimpleName() : Class 클래스의 메소드 클래스의 간결한 이름을 반환한다. 패키지 정보 제외한 클래스 이름만 얻어올 때 사용
}
public class GenericEx3 {
    public static void main(String[] args) {
        // Course A 모든 사람이 신청 가능.
        Person person = new Person();
        Applicant<Person> applicant = new Applicant<>(person);
        Course.registerCourseA(applicant);
        Course.registerCourseA(new Applicant<Teacher>(new Teacher()));
        Course.registerCourseA(new Applicant<Student>(new Student()));
        Course.registerCourseA(new Applicant<WebStudent>(new WebStudent()));
        Course.registerCourseA(new Applicant<MobileStudent>(new MobileStudent()));

//        이거와 같다.
//        Course.registerCourseA(new Applicant<Person>(new Person()));

        // Course B Student 만 등록 가능. (Student의 서브 클래스도 가능.)
//        Course.registerCourseB(new Applicant<Person>(new Person()));    // X ( 부모 격 )
//        Course.registerCourseB(new Applicant<Teacher>(new Teacher()));  // X ( 다른 격 )
        Course.registerCourseB(new Applicant<Student>(new Student()));
        Course.registerCourseB(new Applicant<WebStudent>(new WebStudent()));
        Course.registerCourseB(new Applicant<MobileStudent>(new MobileStudent()));

        // Course C 는 Teacher / Student가 아닌 Person 만 등록 가능.
        Course.registerCourseC(new Applicant<Person>(new Person()));
        Course.registerCourseC(new Applicant<Teacher>(new Teacher()));
//        Course.registerCourseC(new Applicant<Student>(new Student()));
//        Course.registerCourseC(new Applicant<WebStudent>(new WebStudent()));
//        Course.registerCourseC(new Applicant<MobileStudent>(new MobileStudent()));
    }
}
