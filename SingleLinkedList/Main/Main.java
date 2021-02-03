package SingleLinkedList.Main;

import SingleLinkedList.SingleLinkedList.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list567 = new SingleLinkedList<Integer>();
        list567.add(5);
        list567.add(6);
        list567.add(7);
        SingleLinkedList<Integer> list234 = new SingleLinkedList<Integer>();
        list234.add(2);
        list234.add(3);
        list234.add(4);
        list234.addAll(list567);
        list234.traverse();
        list234.removeLast();
        list234.traverse();
    }
}
