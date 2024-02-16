package _03_array;

// Collection Type
// : 객체를 효율적으로 추가, 삭제, 검색할 수 있도록 관련 인터페이스 & 클래스를 java.util 에 포함 시켜 놓음.

// List
// ㄴ Array List

// Set
// ㄴ HashSet
// ㄴ TreeSet

// Map
// ㄴ HashMap
// ㄴ Hashtable
// ㄴ TreeMap

// ArrayList 클래스
// - List 컬렉션에서 가장 많이 사용하는 컬렉션
// - 표준 배열보다 조금 느릴 수 있으나, 배열에서 많은 조작이 필요한 경우 유용
// - 크기를 미리 지정하지 않아도 됨 (동적할당, 일반 배열과 차이점)
// - List 컬렉션은 객체 자체를 저장하는게 아니라, 객체 번지(주소)를 저장 -> 동일한 객체 중복 저장 = 동일한 번지수 저장, null 도 가능.
//

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {
    public static void main(String[] args) {
//        1. ArrayList 생성 (정수형)
        ArrayList<Integer> numbers = new ArrayList<>();

//        2. 요소 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

//        3. 요소 접근
        System.out.println("첫번째 요소 : " + numbers.get(0)); // 10

//        4. 요소 수정
        numbers.set(1, 77);
//        arrayList는 변수명으로 호출이 가능하다.
        System.out.println("numbers : " + numbers); // [10, 77, 30, 40, 50]

//        5. 요소 삽입 (지정된 위치)
        numbers.add(1,7);
        System.out.println("numbers : " + numbers); // [10, 7, 77, 30, 40, 50]

//        6. ArrayList 끼리 연결
        System.out.println(Arrays.asList(99, 33, 44)); // [99, 33, 44]
        numbers.addAll(Arrays.asList(99, 33, 44));
        System.out.println("numbers : " + numbers); // [10, 7, 77, 30, 40, 50, 99, 33, 44]

//        7. 요소 위치 찾기
        System.out.println(numbers.indexOf(10)); // 0
        System.out.println(numbers.indexOf(30)); // 3
        System.out.println(numbers.indexOf(99)); // 6

//        8. 요소 삭제
        numbers.remove(2);
        System.out.println("numbers : " + numbers); // [10, 7, 30, 40, 50, 99, 33, 44]

//        9. 리스트 크기 확인
        System.out.println("리스트 크기 : " + numbers.size()); // 8

//        10. 모든 요소 순회
        for (Integer n : numbers) {
            System.out.print(n + " ");
        } // 10 7 30 40 50 99 33 44

//        11. 모든 요소 삭제
        numbers.clear();
        System.out.println("numbers : " + numbers); //  []

        //////////////////////////////
//        Student 타입의 ArrayList 생성

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("John", 10));

//        이렇게 하는것과 같다.
        Student student = new Student("jennie",19);
        students.add(student);
//        /////////////////
        students.add(new Student("Lily", 40));
        students.add(new Student("Lisa", 30));

        System.out.println("학생 수 : " + students.size());
        Student std = students.get(0); // 0번 학생 확인
        System.out.println(std.getName() + " 학생의 나이는 " + std.getAge());

        for (Student std1 : students) {
            System.out.println(std1.getName() + "(" + std1.getAge() + ")");
        }

        System.out.println("students : " + students);
//        toString을 오버라이딩 안했을 경우 : [_03_array.Student@30f39991, _03_array.Student@452b3a41, _03_array.Student@4a574795, _03_array.Student@f6f4d33]
//        원래는 주소값이 저장되는것이 맞다.
//        numbers는 왜 내용이 나왔을까? 자바에서 제공해주는 애들은 하나의 메소드가 안에 포함이 되어있다.
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

//    toString() 메서드 오버라이드
//    : 객체를 문자열로 표현할 때 어떻게 출력할지 정의 가능 (변수 이름으로 println 했을 때)
//    사용자 정의 타입에서 오버라이드 하지 않으면, Object 객체의 toString() 메서드가 호출되며,
//    이는 객체의 클래스 이름과 해시코드를 문자열로 반환 (즉, 참조값을 반환) (Ex. Student@f6f4d33)

//    단, Integer 같은 클래스는 toString() 메서드가 정의되어 있어서, 문자열로 표현할 때 Integer 객체가 갖고 있는 toString 메서드 호출
//    언어테이션 @Override
//    ArrayList들 마다 추가를 해줘야한다. return 값을 토대로 출력.
    @Override
    public String toString() {
        return "name='" + name + '\'' + ", age = " + age;
    }
}
