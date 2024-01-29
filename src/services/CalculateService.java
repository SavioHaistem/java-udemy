package services;

import java.util.List;

public class CalculateService {
    public static <T extends Comparable<T>> T last(List<T> list) {
        if (list.isEmpty()) {
            throw  new IllegalArgumentException("A lista de alunos esta vazia");
        } else {

            T lastStudent = list.getFirst();
            for (T student : list) {
                if(student.compareTo(lastStudent) > 0) {
                    // o compareTo e testado com ">" porque ele retorna -num para resultado menor
                    // e +num para resultados maiores

                    lastStudent = student;
                }
            }

            return lastStudent;
        }
    }
}
