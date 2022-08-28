import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    ArrayList<Bank> banks = new ArrayList<>();

    public void createAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name and Last Name");
        String name = sc.nextLine();
        int accountNo = createAccountNo();
        System.out.println("Enter balance to store in account");
        int balance = sc.nextInt();
        Bank bank = new Bank(name,accountNo,balance);
        banks.add(bank);
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

}
