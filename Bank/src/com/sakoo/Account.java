package com.sakoo;

public abstract class Account {
        double Acc_Balance;
        String Name;
        String Acc_no;
		public Account(double acc_Balance, String name, String acc_no) {
			super();
			Acc_Balance = acc_Balance;
			Name = name;
			Acc_no = acc_no;
		}
		public double getAcc_Balance() {
			return Acc_Balance;
		}
		public void setAcc_Balance(double acc_Balance) {
			Acc_Balance = acc_Balance;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getAcc_no() {
			return Acc_no;
		}
		public void setAcc_no(String acc_no) {
			Acc_no = acc_no;
		}
		public void deposite(double money)
		{
			Acc_Balance=Acc_Balance+money;
			System.out.println("Money Deposited Sucessfully");
		}
		public abstract void withdraw(double money);
		public abstract void calculateInterest();
}
	
