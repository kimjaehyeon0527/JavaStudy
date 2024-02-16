package _05_class._02_access_modifier._pack5;

public class Rectangle {
    private int width;
    private int height;

    static int countIns = 0;

    //        생성자
    public Rectangle(int width) {
        this.width = width;
        countIns++; // 새로운 Rectangle 인스턴스가 생성될 때마다 개수 증가.
    }
    //         가로
    public int getWidth() {
        return width;
    }
    //        세로
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int area() {
        return width * height;
    }
    static public int getCountIns() {
        return countIns;
    }
}
