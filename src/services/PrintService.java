package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    private List<Integer> numbers;

    public PrintService(Integer size) {
        this.numbers = new ArrayList<>(size);
    }

    public void addNumber(int number) {
        this.numbers.add(number);
    }

    public void print() {
        System.out.println(numbers.toString());
    }

    public int first() {
        return numbers.get(0);
    }
}
