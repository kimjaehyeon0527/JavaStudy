package _05_class._05_inheritance;

public class Car {

    private String name;

    private int distance;

    private int people;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    private void ride() {
        System.out.println("안전운행");
    }

}
