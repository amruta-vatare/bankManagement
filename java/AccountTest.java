import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        Account ac = new Account();
        do {
            System.out.println("Choose Option");
            System.out.println("1. Create Account");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Account Information");
            System.out.println("5. Exit");
            System.out.println("-------------------------");
            ch = sc.nextInt();
            switch (ch){
                case 1:
                    ac.createAccount();
                    break;
                case 2:
                    ac.withdraw();
                    break;
                case 3:
                    ac.deposit();
                    break;
                case 4:
                    ac.accountInfo();
                    break;
                case 5:
                    System.out.println("See you again!");
                default:
                    break;
            }
        }while(ch != 5);

    }
}
