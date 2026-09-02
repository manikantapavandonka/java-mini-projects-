package BANK_APPLICATION_DEV;

import java.util.Scanner;

public class bankProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        String customerName = sc.nextLine();
        System.out.println("Enter Customer Address:");
        String customerAddress = sc.nextLine();
        System.out.println("Enter Phone Number:");
        long phoneNumber = sc.nextLong();
        System.out.println("Initial Deposite Amount:");
        double balance = sc.nextDouble();
        System.out.println("Details Entered Successfully");

        BankApplication acc = new BankApplication(customerName, customerAddress, phoneNumber, balance);

        int options;
        do {
            System.out.println("Select an Option from below");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposite");
            System.out.println("3.Show Balance");
            System.out.println("4.Exit");

            System.out.println("choose the options from the menu:");
            options = sc.nextInt();

            switch (options) {
                case 1:
                    System.out.println("Enter Withdrawal Amount: ");
                    int amount = sc.nextInt();
                    acc.withdraw(amount);
                    break;
                case 2:
                    System.out.println("Enter Deposite Amount:");
                    amount = sc.nextInt();
                    acc.deposit(amount);
                    break;
                case 3:
                    acc.showBalance();
                    break;
                case 4:
                    System.out.println("thank you");
                    break;

                default:
                    System.out.println("Invalid Option !");
                    break;
            }
        } while (options < 4);

        sc.close();
    }
}
