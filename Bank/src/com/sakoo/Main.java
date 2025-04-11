package com.sakoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bank bank = new bank();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to XYZ Bank!");
        System.out.print("How many accounts do you want to create? ");
        int accountCount = scanner.nextInt();

        for (int i = 0; i < accountCount; i++) {
            System.out.println("\nEnter details for Account " + (i + 1) + ":");
            System.out.println("Choose Account Type:");
            System.out.println("1. Savings");
            System.out.println("2. Salary");
            System.out.println("3. Current");
            System.out.println("4. Loan");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            System.out.print("Enter Name: ");
            String name = scanner.next();

            System.out.print("Enter Account Number: ");
            String accNo = scanner.next();

            System.out.print("Enter Balance: ");
            double balance = scanner.nextDouble();

            switch (choice) {
                case 1:
                    bank.createAccount(new Savings(balance, name, accNo));
                    break;
                case 2:
                    bank.createAccount(new Salary(balance, name, accNo, false, 0));
                    break;
                case 3:
                    bank.createAccount(new Current(balance, name, accNo));
                    break;
                case 4:
                    bank.createAccount(new Loan(balance, name, accNo));
                    break;
                default:
                    System.out.println("Invalid choice! Account not created.");
            }
        }

        bank.performActivity();
    }
}
