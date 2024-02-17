package _05_class._06_abstract;

public abstract class Student {
    private String name;
    private String school;
    private int age;
    private int num;

    public Student(String name, String school, int age, int num) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.num = num;
    }

    public String getName() {
        return name;
    }


    public String getSchool() {
        return school;
    }


    public int getAge() {
        return age;
    }


    public int getNum() {
        return num;
    }


    abstract void todo();

    void start() {
        System.out.println("===== " + name + " 학생의 정보 =====");
    }

}
