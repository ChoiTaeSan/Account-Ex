public class Account {
    private String num;
    private int balance;

    public String getNum() {
        return num;
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount){
        balance += amount;
    }

    public Account(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    public boolean transfer(Account account, int amount){
        if (this.balance >= amount){
            this.balance -= amount;
            account.deposit(amount);
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "num='" + num + '\'' +
                ", balance=" + balance +
                '}';
    }
}
