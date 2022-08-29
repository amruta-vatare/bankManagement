public class Report {
    String date ;
    long accNo;
    int amt;
    String transaction;
    long balance;

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public Report(String date, long accNo, int amt, String transaction, long balance) {
        this.date = date;
        this.accNo = accNo;
        this.amt = amt;
        this.transaction = transaction;
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }


}
