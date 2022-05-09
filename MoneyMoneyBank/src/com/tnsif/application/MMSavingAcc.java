package com.tnsif.application;

import com.tnsif.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}

	private static final float MINBAL=1000;
     	public void withdraw(float accBal)
	{
		System.out.println("Welcome user!! your acc bal is " + accBal + "and You can withdraw "+ (accBal - MINBAL));
	}

	@Override
	public String toString() {
		return "MMSavingAcc [accNm=" + accNm + ", accBal=" + accBal + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}