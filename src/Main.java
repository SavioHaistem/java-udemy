import model.entities.Account;
import model.exceptions.WithdrawAmountException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter account data: ");
            System.out.print("Account number: ");
            int accountId = scan.nextInt();
            scan.nextLine();
            System.out.print("Holder name: ");
            String holderName = scan.nextLine();
            System.out.print("Initial deposit: ");
            double initialBalance = scan.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = scan.nextDouble();

            Account account = new Account(accountId,holderName,initialBalance,withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            account.withDraw(scan.nextDouble());
            System.out.print("new balance: " + account.getBalance());

        } catch (WithdrawAmountException e) {
            System.err.println(e.getMessage());
        }
    }
}