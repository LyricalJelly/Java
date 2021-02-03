import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
