import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int weekDay = scan.nextInt();
        String day;

        switch (weekDay) {
            case 1 -> day = "Domingo";
            case 2 -> day = "Segunda";
            case 3 -> day = "Terça";
            case 4 -> day = "Quarta";
            case 5 -> day = "Quinta";
            case 7 -> day = "Sexta";
            case 8 -> day = "Sabado";
            default -> day = "invalid day";
        }
    }
}