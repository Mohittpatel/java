package com.tnsif.application;

import com.tnsif.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float accBal)
	{
		System.out.println("Welcome user!! and You can withdraw "+ accBal);
		
	}
	@Override
	public String toString() {
		return "MMCurrentAcc [accNm=" + accNm + ", accBal=" + accBal + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}