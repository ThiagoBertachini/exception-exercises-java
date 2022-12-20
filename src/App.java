import entities.Account;
import entities.exceptions.AccountDomainException;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter account data: ");

            System.out.print("Number: ");
            Integer number = sc.nextInt();
            sc.nextLine();

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balancer: ");
            Double initialBalance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            acc.withdraw(sc.nextDouble());

            System.out.println();
            System.out.print("New balance: ");
            System.out.println(acc.getBalance());

            sc.close();

        }catch (AccountDomainException e){
            System.out.println("Withdraw error " + e.getMessage());
        }catch (RuntimeException e){
            System.out.println("Erro inesperado");
        }

        System.out.println(new Account(10, "abc", 2.0, 0.0).getBalance());
        System.out.println("FIM PROGRAMA");

    }
}
