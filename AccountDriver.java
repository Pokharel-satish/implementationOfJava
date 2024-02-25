import java.util.ArrayList; // input array
import java.util.Scanner;   // input data 

 class AccountDriver {      // main class
    public static void main(String[] args) { //main method 
        Scanner scanner = new Scanner(System.in);  // inputting data
        ArrayList<Account> accountList = new ArrayList<>();// generating array list
        // The cID,cNAME,cADDRESS,cPHONE,cBALANCE is created for 10 individual acc
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter account details for Account " + (i + 1) + ":");
            System.out.print("Customer ID: ");
            String custID = scanner.next();
            System.out.print("Customer Name: ");
            String custName = scanner.next();
            System.out.print("Customer Address: ");
            String custAddress = scanner.next();
            System.out.print("Customer Phone: ");
            int custPhone = scanner.nextInt();
            System.out.print("Initial Balance: ");
            double balance = scanner.nextDouble();

            Account account = new Account(custID, custName, custAddress, custPhone, balance);
            accountList.add(account);
        }

        // menu is added as mentioned 
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add account");
            System.out.println("2. Display individual account");
            System.out.println("3. Display all accounts");
            System.out.println("4. Deposit to individual account");
            System.out.println("5. Withdraw from individual account");
            System.out.println("6. Financial Year ending");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {  // switch statement for instant  jump 
                case 1:
                    System.out.println("Enter account details:");

                    break;

                case 2:
                    // Display individual acc details 
                    break;

                case 3:
                    // Display all accounts information thereafter 
                    for (Account account : accountList) {
                        System.out.println(account);
                    }
                    break;

                case 4:
                    // Deposit to individual account
                    break;

                case 5:
                    // Withdraw from individual account
                    break;

                case 6:
                    for (Account account : accountList) {
                        account.yearlyinterest();
                    }
                    System.out.println("Yearly interest applied to all accounts.");
                    break;

                case 7:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 7);

        scanner.close();
    }
    }

