package Pratices.SortList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Volvo");
        arrayList.add("BMW");
        arrayList.add("Ford");
        arrayList.add("Mazda");

        Collections.sort(arrayList);

        System.out.println(arrayList);
    }
}
