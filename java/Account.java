import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    ArrayList<Bank> banks = new ArrayList<>();
    int accNo;
    int amt;

    public void createAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name and Last Name");
        String name = sc.nextLine();
        int accountNo = createAccountNo();
        System.out.println("Enter balance to store in account");
        int balance = sc.nextInt();
        Bank bank = new Bank(name,accountNo,balance);
        banks.add(bank);
        System.out.println("--------------------------------------------");
        display();
        System.out.println("--------------------------------------------");
    }

    public int createAccountNo(){
        int random = (int)Math.floor(Math.random()*50000)%500;
        System.out.println(random);
        for(Bank b :banks){
            if(random == b.getAccountNo()){
                createAccountNo();
            }
        }
        return random;
    }
    public void display(){
        System.out.println("\t"+"Name "+"\t\t Account No "+"\t Balance");
        System.out.println("--------------------------------------------");
        for(Bank b : banks){
            System.out.println(b.getName()+"\t\t"+b.getAccountNo()+"\t\t\t\t"+b.getBalance());
        }
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account no");
        accNo = sc.nextInt();
        System.out.println("Enter the amount");
        amt = sc.nextInt();
        Bank bank = search(accNo);
        if(bank != null){
            long balance = bank.getBalance();
            if(balance<amt){
                System.out.println("Insufficient balance can't withdraw");
            }else{
                balance = balance - amt;
                bank.setBalance( balance);
                updateAccount(bank);
                System.out.println("Successfully Withdraw "+amt);
                System.out.println("--------------------------------------------");
                display();
                System.out.println("--------------------------------------------");
            }
        }else{
            System.out.println("Incorrect Account Number");
        }

    }

    private void updateAccount(Bank bank) {
        for(Bank b : banks){
            if(b.getAccountNo() == bank.getAccountNo()){
                b = bank;
            }
        }
    }

    public Bank search(int accNo){
        for (Bank b : banks){
            if(b.getAccountNo() == accNo)
                return b;
        }
        return null;
    }


    public void deposit() {
    }

    public void accountInfo() {
    }
}
