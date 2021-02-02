package Main;

import MyArrayList.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        list.add(0, 0);
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println(list.contains(13));
    }

}
