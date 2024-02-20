package _07_generic._Practice1;

public class PairEx {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair("One", 1);
        System.out.println("Key : " + p.getKey() + ", Value : " + p.getValue());

        Pair<Integer, String> q = new Pair(2, "Two");
        System.out.println("Key : " + q.getKey() + ", Value : " + q.getValue());



    }
}
