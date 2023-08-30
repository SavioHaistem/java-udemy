import java.util.Scanner;

import products.Product;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Digite o nome do produto: ");
        product.name = scan.nextLine();
        System.out.println("Digite a quantidade no estoque: ");
        product.quant = scan.nextInt();
        System.out.println("Digite o preco do produto: ");
        product.price = scan.nextDouble();

        //verificando o estoque atual
        System.out.printf("O produto %s possui %d quantidades em estoque, a unidade vale %.2f reais%n", product.name, product.quant, product.price);
        System.out.printf("O estoque deste produto no momento vale: %.2f reais%n", product.totalValueInStock());

        //atualizando estoque depois das vendas
        System.out.println("Digite quantos produtos foram compradas: ");
        product.removeProducts(scan.nextInt());
        System.out.printf("Restou %d, o estoque agora vale %.2f reais%n", product.quant, product.totalValueInStock());

        //repondo o estoque
        System.out.println("Digite a quantidade reposta: ");
        product.addProducts(scan.nextInt());
        System.out.printf("O estoque agora vale %.2f e possui %d unidades de %s%n", product.totalValueInStock(), product.quant, product.name);
    }
}
