package com.sakoo;

public   class Loan extends Account {

	

	public Loan(double acc_Balance, String name, String acc_no) {
		super(acc_Balance, name, acc_no);
		// TODO Auto-generated constructor stub
	}
	
	public void payLoan(double amount)
	{
		if(amount>0)
		{
			Acc_Balance+=amount;
			if(Acc_Balance>=0) {
				Acc_Balance=0;
				System.out.println("Loan Paid Succesfully!!!");
			}
			else
			{
				System.out.println("Amount credited for loan payment succesfully");
			}
		}
		else {
			System.out.println("Invalid payable amount");
		}
	}
	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		double interest=(Acc_Balance*0.80*5/12);
		System.out.println("Interest:"+interest);
		
	}

	@Override
	public void withdraw(double money) {
		// TODO Auto-generated method stub
		
	}

	
	
 
	

	
}
