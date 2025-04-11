package com.sakoo;

public  class Salary extends Account {
	

	boolean is_Frozen;
	int notransaction_count;
	
	
	public Salary(double acc_Balance, String name, String acc_no, boolean is_Frozen, int notransaction_count) {
		super(acc_Balance, name, acc_no);
		this.is_Frozen = false;
		this.notransaction_count =0;
	}
	
	@Override
	public void deposite(double money) {
		if(!is_Frozen)
		{
			super.deposite(money);
			acc_not_active_count();
			System.out.println("Amount credited sucessfully");
		}
		else
		{
			System.out.println("Cannot deposit ,account is frozen");
		}
		
	}

	
	
	@Override
	public void withdraw(double money) {
		// TODO Auto-generated method stub
		if(!is_Frozen && Acc_Balance>money)
		{
			Acc_Balance-=money;
			acc_not_active_count();
			System.out.println("Account debited sucessfully");
		}
		else if(is_Frozen)
		{
			System.out.println("Cannot withdraw,account is frozen");
		}
		else
		{
			System.out.println("Insufficient balance");
		}
		
	}
	 public void acc_not_active_count() {
		 notransaction_count=0;
	 }
	
	 public void Freeze_account() {
		 notransaction_count++;
		 if( notransaction_count>=2)
		 {
			 is_Frozen=true; 
		 }
	 }
	 @Override
		public String toString() {
			return "Salary [is_Frozen=" + is_Frozen + ", notransaction_count=" + notransaction_count + "]";
		}

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		
	}
	
	

	

}
