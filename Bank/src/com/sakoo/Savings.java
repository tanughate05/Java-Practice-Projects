package com.sakoo;

public  class Savings extends Account{
	

	public Savings(double acc_Balance, String name, String acc_no) {
		super(acc_Balance, name, acc_no);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void deposite(double money) {
		// TODO Auto-generated method stub
		super.deposite(money);
	}

	

	@Override
	public void withdraw(double money) {
		if( Acc_Balance<=10000) {
			System.out.println("Sorry!! cannot withdraw money due to low balance");
		}
		else
		{
			Acc_Balance-=money;
			System.out.println("Your Account is debited by Rs:"+money);
		}
		
	}



	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		
	}
        
}
