import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        createDue(checkTime());
    };

    static int checkTime() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a quantidade de minutos: ");
        return scan.nextInt();
    };

    static void createDue(int time) {
        int dueValue = time <= 100 ? 50 : (time - 100) * 2 + 50;

        System.out.printf("Valor a pagar: R$%d", dueValue);
    };
}