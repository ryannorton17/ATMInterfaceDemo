import java.util.Scanner;

class BankAccount {
    String customerFirstName = "Ryan";
    String customerLastName = "Norton";
    String accountNumber = "23456b";
    int pin = 1234;
    double balance = 2_000.00;
    double recentTransaction = 0;
    String displayRecent = "" + recentTransaction;

    //intro

    //Menu Operation Methods

    //1. Display Balance
    void displayBalance() {
        System.out.println(customerFirstName + ", your current balance is " + "$" + balance);
    }

    //2. Make Deposit
    void deposit(double amount) {
        if (amount != 0) {
            recentTransaction = amount;
            displayRecent = "+" + "$" + recentTransaction + " deposit.";
            balance = balance + amount;
        } else {
            System.out.println(customerFirstName + ", you cannot deposit $0.");
        }
    }

    //3. Make Withdraw
    void withdraw(double amount) {
        if (amount != 0) {
            recentTransaction = amount;
            displayRecent = "-" + "$" + recentTransaction + " withdraw.";
            balance = balance - amount;
            System.out.println(customerFirstName + ", you have withdrawn " + amount
                    + ". Your current balance is now " + balance);
        } else {
            System.out.println(customerFirstName + ", you cannot withdraw $0.");
        }
    }

    //4. Recent Transaction
    void recentTransaction() {
        System.out.println(displayRecent);
    }



    // Menu
    void menu() {

        Scanner scanner = new Scanner(System.in);
        // System Greeting
        System.out.println("Welcome to the main menu, " + customerFirstName+ ". Please make a selection.");
        System.out.println("\n");
        System.out.println("Please enter a number to make a selection:");
        System.out.println("1: Display Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("4: Display Most Recent Transaction");
        System.out.println("5: Exit");

        // menu choices run through a do while loop, with a switch enacting choices.

        int choice = scanner.nextInt();
        System.out.println("You entered: " + choice);
        System.out.println("");

        do {
            System.out.println("====================================================================");
            System.out.println("==========================PROCESSING================================");
            System.out.println("====================================================================");
            System.out.println("");

            switch(choice) {
                case 0: // menu | the purpose of choice 0 is to return the user to the main menu
                    menu();
                    break;

                case 1: //balance
                    displayBalance();
                    System.out.println("");
                    choice = 0;
                    break;

                case 2: //deposit
                    System.out.println("Please enter an amount to deposit.");
                    double amount = scanner.nextDouble();
                    deposit(amount);
                    System.out.println("You have deposited " + amount +". Your new balance is $" + balance + ".");
                    System.out.println("Transaction complete. Returning to main menu.");
                    System.out.println("");
                    choice = 0;
                    break;

                case 3: //withdraw
                    System.out.println("Please enter an amount to withdraw.");
                    amount = scanner.nextDouble();
                    withdraw(amount);
                    System.out.println("You have withdrawn " + amount +". Your new balance is $" + balance + ".");
                    System.out.println("Transaction complete. Returning to main menu.");
                    System.out.println("");
                    choice = 0;
                    break;

                case 4: //most recent transaction
                    System.out.println("Your most recent transaction was: ");
                    recentTransaction();
                    System.out.println("Returning to the main menu.");
                    System.out.println("");
                    choice = 0;
                    break;

            }

        } while (choice != 5);
        System.out.println("Exiting menu.. Thank you for choosing Big Bank!");
        System.exit(0);

        // Accept customer selection. Code takes first letter of user-entered String.


    }
}
