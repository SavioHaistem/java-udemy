import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        basicCalcs();
    }
    static void basicCalcs() {
        double x = 2.0;
        double y = 3.0;
        double z = -4.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println(A);
    }
    static void useScanner() {
        Scanner inputIn = new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String userName = inputIn.next();

        System.out.print("digite sua idade: ");
        Integer userAge = inputIn.nextInt();

        System.out.print("sua frase de efeito: ");
        inputIn.nextLine(); //consumindo a quebra de linha;
        String wordEffect = inputIn.nextLine();

        System.out.printf("O usuario %s de %d anos disse %s %n", userName, userAge, wordEffect);

        inputIn.close();
    }
    static void printProducts() {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 2345;
        char gender = 'F';

        double computerPrice = 2100.0;
        double deskPrice = 650.50;
        double measure = 53.234567;

        System.out.println(" ");
        System.out.printf("%s, which price is R$ %.2f reais %n%s which price is R$ %.2f reais %n",product1, computerPrice, product2, deskPrice);
        System.out.println(" ");
        System.out.printf("Record: %d, code %d and gender %s%n",age, code, gender);
        System.out.println(" ");
        System.out.printf("Measure with eight decimal places: %f%nRounded (three decimal places): %.3f%n %n", measure, measure);
    }

    static void casting() {
        /*
        * Ao fazermos uma expressao matematica com numeros inteiros o java ira
        * considerar que o resultado da operacao sera inteiro para evitar isso devemos fazer
        * o seguinte:
        * */

        int x, y;
        double result;
        x = 5;
        y = 2;

        result = (double) x / y;
        System.out.println(result);

        /*
        * relacionando variaveis de tipos diferentes
        * */

        int first = 1;
        double second = 2.0;

        first = (int) second;
        System.out.printf("%n" + first);
    }
}