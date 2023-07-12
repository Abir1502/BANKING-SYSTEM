   import java.util.Scanner;

    class BankAccount {
    private String accountHolder;
    private double balance;
    private String branchName;
    private String accountNumber;
    private String ifscCode;

    public BankAccount(String accountHolder, double initialBalance, String branchName, String accountNumber, String ifscCode) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.branchName = branchName;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " successfully.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " successfully.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
    public String getAccountHolder()  {
    	return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }
}

     public class BankingSystem {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter branch name: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter IFSC code: ");
        String ifscCode = scanner.nextLine();

        BankAccount account = new BankAccount(accountHolder, initialBalance, branchName, accountNumber, ifscCode);

        while (true) {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else if (choice == 3) {
                System.out.println("Account balance: " + account.getBalance());
            } else if (choice == 4) {
                System.out.println("Account Holder Name: " + account.getAccountHolder());
                System.out.println("Branch Name: " + account.getBranchName());
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("IFSC Code: " + account.getIfscCode());
            } else if (choice == 5) {
                System.out.println("Thank you for using our banking system.");
                break;
            } else {
                System.out.println("Invalid choice. Please try again");}
        }}}
