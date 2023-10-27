import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("columns: ");
        int columns = scan.nextInt();

        System.out.print("lines: ");
        int lines = scan.nextInt();

        Integer[][] matriz = new Integer[lines][columns];


        for (int countLines = 0; countLines < matriz.length; countLines++) {
            for (int countColumns = 0; countColumns < matriz[countLines].length; countColumns++) {
                System.out.printf("type [line: %d], [column: %d]", countLines, countColumns);
                matriz[countLines][countColumns] = scan.nextInt();
            }
        }

        for (int countLines = 0; countLines < matriz.length; countLines++) {
            for (int countColumns = 0; countColumns < matriz[countLines].length; countColumns++) {
                System.out.print(matriz[countLines][countColumns]);
            }
            System.out.printf("%n");
        }
    }
}