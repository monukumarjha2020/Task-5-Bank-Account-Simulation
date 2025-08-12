import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create account
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        Account account = new Account(name, initialBalance);

        // Menu loop
        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("💰 Current Balance: ₹" + account.getBalance());
                    break;
                case 4:
                    account.printTransactionHistory();
                    break;
                case 5:
                    System.out.println("👋 Thank you for banking with us!");
                    break;
                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
