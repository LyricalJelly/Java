package SingleLinkedList.Main;

import SingleLinkedList.SingleLinkedList.SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list567 = new SingleLinkedList<Integer>();
        list567.add(5);
        list567.add(6);
        list567.traverse();
        list567.removeLast();
        list567.removeFirst();
        list567.traverse();
    }
}
