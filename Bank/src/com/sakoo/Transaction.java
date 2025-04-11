package com.sakoo;

public class Transaction {
    private String[] transactionLog = new String[100];
    private int transactionCount = 0;

    public void addTransaction(String transactionDetail) {
        if (transactionCount < transactionLog.length) {
            transactionLog[transactionCount++] = transactionDetail;
        } else {
            System.out.println("Transaction log is full!");
        }
    }

    public void showTransactions() {
        System.out.println("\nEnd of Day Report:");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactionLog[i]);
        }
        transactionCount = 0; 
    }
}
