// Checking Account
public class CurrentAccount extends Account {

    // Default Transaction Fee
    private static double transactionfee = 2.5;

    // default constructor
    public CurrentAccount() {
        super();
    }

    public CurrentAccount(int accountNumber, double transactionfee) {
        super(accountNumber);
        transactionfee = transactionfee;
    }

    /**
     * Function to deposit funds into the account as long as the amount parameter is
     * > 0
     * <p>
     * Apply Transaction fee for the CheckingAccount
     *
     * @param amount value to be deposited
     */
    public void deposit(double amount) {

        // First Check amount
        if (amount > 0) {
            balance += amount;
            System.out.printf("Amount %.2f deposited%n", amount);
            balance -= transactionfee;
            System.out.printf("transaction fee %.2f Applied%n", transactionfee);
            System.out.printf("Current Balance is: %.2f%n", balance);

        } else {
            System.out.println("A negative amount cannot be deposited");
        }
    }

    /**
     * Function to withdraw funds from the Account as long as 1. Amount to withdraw
     * must not be > 100000. Amount to withdraw must be <= balance
     *
     * @param amount value to be withdrawn
     */
    public void withdraw(double amount) {
        if (amount >=100000.0) {
            // Check sufficient balance
            if ((amount) <= balance) {
                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                balance -= amount;
                System.out.printf("Current Balance is: %.2f%n", balance);
            }
        } else {
            System.out.println("Limit Exceeded");
        }
    }
    }

