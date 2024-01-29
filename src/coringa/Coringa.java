package coringa;

import services.PrintItAll;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Coringa {
    public static void main(String[] args) {
        System.out.println("Coringa methods");

        List<?> list = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        List<Objects> objects = new ArrayList<>();

        //list<Object> can't receive a Integer or others objects list

        //objects = strings | it will return a error;

        //but List<?> should receive the others objects list:
        //list = strings;
        //list = objects;

        strings.add("Vaila");
        strings.add("Vailar");
        strings.add("Vailagay");
        integers.add(80);
        integers.add(0);
        integers.add(8);

        PrintItAll.printList(strings);
        PrintItAll.printList(integers);
    }
}
