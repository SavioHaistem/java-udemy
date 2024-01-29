package services;

import java.util.List;

public class PrintItAll {
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
