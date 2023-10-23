import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type array size: ");
        int N = scan.nextInt();
        double[] array = new double[N];

        double media = 0;

        for (int i = 0; i < N; i++) {
            array[i] = scan.nextDouble();
            media += array[i];
        }

        for (double i : array) {
            System.out.println(i);
        }

        System.out.println("media: " + media / N);
    }
}