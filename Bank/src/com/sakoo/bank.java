package com.sakoo;

import java.util.Scanner;

public class bank {
    private Account[] accounts = new Account[100];
    private int accountCount = 0;
    private Transaction transaction = new Transaction();

    public void createAccount(Account account) {
        if (accountCount < accounts.length) {
            accounts[accountCount++] = account;
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Cannot create more accounts. Maximum limit reached!");
        }
    }

    private Account findAccount(String accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAcc_no().equals(accNo)) {
                return accounts[i];
            }
        }
        return null;
    }

    public void performActivity() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Pay Loan\n4. Show Account Details\n5. End Day and Show Transactions\n6. Exit");
            System.out.print("Choose an activity: ");
            int choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter Account Number: ");
            String accNo = scanner.next();
            Account account = findAccount(accNo);

            if (account == null) {
                System.out.println("Account not found!");
                continue;
            }

            switch (choice) {
                case 1:
                    handleDeposit(scanner, account, accNo);
                    break;
                case 2:
                    handleWithdraw(scanner, account, accNo);
                    break;
                case 3:
                    handleLoanPayment(scanner, account, accNo);
                    break;
                case 4:
                    showAccountDetails(account);
                    break;
                case 5:
                    transaction.showTransactions();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void handleDeposit(Scanner scanner, Account account, String accNo) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposite(amount);
        transaction.addTransaction("Deposited " + amount + " to account " + accNo);
    }

    private void handleWithdraw(Scanner scanner, Account account, String accNo) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
        transaction.addTransaction("Withdrew " + amount + " from account " + accNo);
    }

    private void handleLoanPayment(Scanner scanner, Account account, String accNo) {
        if (account instanceof Loan) {
            System.out.print("Enter amount to pay for loan: ");
            double amount = scanner.nextDouble();
            ((Loan) account).payLoan(amount);
            transaction.addTransaction("Paid loan amount " + amount + " for account " + accNo);
        } else {
            System.out.println("Not a loan account!");
        }
    }

    private void showAccountDetails(Account account) {
        System.out.println("Account Details:");
        System.out.println("Name: " + account.getName());
        System.out.println("Account Number: " + account.getAcc_no());
        System.out.println("Balance: " + account.getAcc_Balance());
    }
}
