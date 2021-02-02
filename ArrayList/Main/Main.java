package Main;


public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        list.add(10, 10);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // ArrayList<Integer> a = new ArrayList<>();
        // a.add(10,10);
    }
}
