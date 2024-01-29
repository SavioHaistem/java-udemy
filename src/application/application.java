package application;

import entities.Inscription;
import services.CalculateService;

import java.util.ArrayList;
import java.util.List;

public class application {
    public static void main(String[] args) {
        List<Inscription> queue = new ArrayList<>();
        queue.add(new Inscription(10,"Ana"));
        queue.add(new Inscription(12,"Marcel"));
        queue.add(new Inscription(11,"Ovalds"));

        System.out.print(CalculateService.last(queue).toString());
    }
}