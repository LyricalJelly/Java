package SingleLinkedList.Main;

import SingleLinkedList.SingleLinkedList.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<Integer>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.addFirst(4);
        list.traverse();
        list.removeFirst();
        list.traverse();
    }
}
