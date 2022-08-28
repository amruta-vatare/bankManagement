public class Bank {

    private String name;
    private int accountNo;
    private long balance;

    public Bank(String name, int accountNo, long balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }


}
