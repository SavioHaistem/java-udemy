public class Main {
    public static void main(String[] args) {
        printProducts();
        casting();
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