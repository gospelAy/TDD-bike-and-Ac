package chaper3;

public class Account {
        private double balance;

        public Account(double balance) {
            this.balance = balance;
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Withdrawal amount exceeded account balance.");
            } else {
                balance -= amount;
            }
        }

        public double getBalance() {
            return balance;
        }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

//    private double balance;
//
//    public Account(double balance) {
//        this.balance = balance;
//    }
//
//    public void withdraw(double amountWithdraw){
//        if (amountWithdraw > balance){
//            System.out.println("Withdrawal amount exceeded account balance");
//        }else {
//            balance = balance - amountWithdraw;
//        }
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }

