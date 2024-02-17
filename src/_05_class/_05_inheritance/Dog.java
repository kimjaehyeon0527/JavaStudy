package _05_class._05_inheritance;

public class Dog extends Animal {
    public Dog(String name, int age) {
        setKind("강아지");
        setName(name);
        setAge(age);
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}
