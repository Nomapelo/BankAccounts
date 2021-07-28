
    public abstract class Account {
        //declaring variables
        private int accountNumber;
        protected double balance;
        //Default Constructors
        public Account() {

        }
        public Account(int accountNumber) {
            this.accountNumber = accountNumber;
            balance = 0;
        }
        // Getter methods
        public double getBalance() {
            return this.balance;
        }

        public int getAccountNumber() {
            return this.accountNumber;
        }
        //

        /**
         * Function to deposit the funds as long the amount is greater than 10000
         * to allow the account to be open for deposit of R1,000.00
         */
        public abstract void deposit(double amount);

        /**
         * Function to withdraw funds from the account when the amount:
         * is greater than zero
         * is <=balance && !>100,000.00>
         *
         * @param amount value to be withdrawn
         */

        public abstract void withdraw(double amount);
    }

