import entities.Contract;
import services.PayPalService;
import services.PaymantService;
import services.TaxService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int contractNumber = scan.nextInt();
        scan.nextLine();
        System.out.print("Data do contrato (dd/mm/yyyy): ");
        LocalDate contractDate = LocalDate.parse(scan.nextLine(),dateFormat);
        System.out.print("Valor do contrato: ");
        double contractValue = scan.nextDouble();
        System.out.print("Quantidade de parcelas: ");
        int parcels = scan.nextInt();

        Contract contract = new Contract(contractNumber,contractDate,contractValue);
        PaymantService paymantService = new PaymantService(new PayPalService());
        paymantService.processParcels(contract,parcels);

        System.out.print(contract);
    }
}