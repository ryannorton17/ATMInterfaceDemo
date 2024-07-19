import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount atm = new BankAccount();
        System.out.println("Hello Customer! Welcome to Big Bank!");
        System.out.println("");
        System.out.println("Please enter your pin.");
        Scanner scanner2 = new Scanner(System.in);
        int pinCheck = scanner2.nextInt();

        // for display purposes only. Not a real security interface
        if (pinCheck == 1234) {
            atm.menu();
        }
        // System closes if user fails pin check
        else{
            System.out.println("Sorry, your pin doesn't match our records. Have a nice day!");
            System.exit(0);
        }



    }
}