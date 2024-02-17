package _05_class._05_inheritance;

public class AnimalEx {
    public static void main(String[] args) {

        Cat cat = new Cat("꼬미", 7);
        System.out.println("종류 : " + cat.getKind());
        System.out.println("이름 : " + cat.getName());
        System.out.println("나이 : " + cat.getAge());
        cat.makeSound();
        System.out.println("---------------------");

        Dog dog = new Dog("메루미", 5);
        System.out.println("종류 : " + dog.getKind());
        System.out.println("이름 : " + dog.getName());
        System.out.println("나이 : " + dog.getAge());
        dog.makeSound();
        System.out.println("---------------------");

    }

}
