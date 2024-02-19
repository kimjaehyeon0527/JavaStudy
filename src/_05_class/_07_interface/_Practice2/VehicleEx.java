package _05_class._07_interface._Practice2;

import java.awt.*;
import java.util.ArrayList;

public class VehicleEx {
    public static void main(String[] args) {
        ArrayList<Vehicle> vc = new ArrayList<>();

        Car car = new Car("벤츠", 160);
        Airplane air = new Airplane("아시아나", 20000);

        vc.add(car);
        vc.add(air);

        for (Vehicle s : vc) {
            System.out.println(s.getName() + "의 최고속력은 " + s.getMaxSpeed() + "km/h 입니다.");
            s.move();

//            if (s == air) {
//                air.fly();
//            }
//            // vehicle instanceof Flyable
//            // Flyable 구현한 경우 fly()메서드호출
//            System.out.print("\n");


            // 지금은 한개이지만 여러개 일때 중첩해서 사용하기 위함.
            System.out.println(s instanceof Flyable);
//            // Flyable 구현한 경우 fly()메서드 호출
            if (s instanceof Flyable) { // Car, Airplane
                ((Flyable) s).fly();    // 명시적 형변환
            }
        }
    }
}
