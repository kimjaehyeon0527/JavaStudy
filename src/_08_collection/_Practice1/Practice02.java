package _08_collection._Practice1;

import java.util.*;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 이름, 나이를 저장할 Map 생성
        Map<String, Integer> map = new HashMap<>();

        System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");

        while (true) {
            // 이름 입력받기
            System.out.print("이름 입력 : ");
            String name = scanner.next();

            // 종료 조건 확인
            if (name.equals("종료")) {
                break;
            } else {
                // 나이 입력 받기
                System.out.print("나이 입력 : ");
            }
            int age = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기.

            // 이름이 이미 존재하는 경우 나이를 갱신, 그렇지 않으면 새로운 이름과 나이를 추가.
            map.put(name, age);
        }
        System.out.println("\n == 입력 받은 이름과 나이 목록 ==");

        Set<Map.Entry<String, Integer>> mapSet = map.entrySet();

        Iterator<Map.Entry<String ,Integer>> entryIterator = mapSet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String ,Integer> entry = entryIterator.next();
            String n = entry.getKey();
            Integer a = entry.getValue();
            System.out.println("이름 : " + n + ", 나이 : " + a);
        }

//        for each 문으로 작성.
//        for (Map.Entry<String ,Integer> entry : map.entrySet()) {
//            System.out.println("이름 : " + entry.getKey() + ", 나이 : " + entry.getValue());
//        }
    }
}
