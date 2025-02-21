package Pratics_LinkList;

import java.util.LinkedList;

public class Exam1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<>();

        // Add Item
        list.add("Orange");
        list.add("Banana");
        list.addFirst("Kiwi");
        list.addLast("bAN");

        System.out.println("Danh sach: " + list);

        // String firstElement = list.getFirst();
        // String lastElement = list.getLast();

    }
}
