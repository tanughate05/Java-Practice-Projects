package com.sakoo;

public  class Current extends Account {

	@Override
	public void deposite(double money) {
		// TODO Auto-generated method stub
		super.deposite(money);
	}


	public Current(double acc_Balance, String name, String acc_no) {
		super(acc_Balance, name, acc_no);
	}
    
	
	@Override
	public void withdraw(double money) {
		// TODO Auto-generated method stub
		if( Acc_Balance<=-10000)
		{
			System.out.println("Due to insufficient balance could not withdraw any money");
			
		}
		else
		{
			Acc_Balance-=money;
		}
		
	}


	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		
	}

}
