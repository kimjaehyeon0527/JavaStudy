package _05_class._05_inheritance;

public class Cat extends Animal {

    public Cat(String name, int age) {
        setKind("고양이");
        setName(name);
        setAge(age);
    }

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}
