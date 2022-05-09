package com.tnsif.framework;

public abstract class SavingAcc extends BankAcc {
	
				private boolean isSalaried;
				private final static float MINBAL=1000f;
				
	
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
					super(accNo, accNm, accBal);
					this.isSalaried = isSalaried;
				}
	@Override

	public void withdraw(float accBal)
	{
		
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", accNm=" + accNm + ", accBal=" + accBal + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
  
}