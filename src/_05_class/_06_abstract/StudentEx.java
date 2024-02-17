package _05_class._06_abstract;

import _05_class._02_access_modifier._pack1.B;

import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {
        Kim kimInfo = new Kim("김철수", "ABC 고등학교",17,20220001);
        Baek baekInfo = new Baek("백영희","XYZ 고등학교",18,20220002);

        kimInfo.start();
        System.out.println("학교 : " + kimInfo.getSchool());
        System.out.println("나이 : " + kimInfo.getAge());
        System.out.println("학번 : " + kimInfo.getNum());
        kimInfo.todo();
        System.out.println("\n");

        baekInfo.start();
        System.out.println("학교 : " + baekInfo.getSchool());
        System.out.println("나이 : " + baekInfo.getAge());
        System.out.println("학번 : " + baekInfo.getNum());
        baekInfo.todo();
    }
}
