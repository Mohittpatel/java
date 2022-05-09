package com.tnsif.application;

import com.tnsif.framework.BankFactory;
public class MMBankFactory implements BankFactory
{
	
	@Override
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
	{
		MMSavingAcc ms = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return ms;
	}
	@Override
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mc = new MMCurrentAcc(accNo, accNm, creditLimit, creditLimit);
		return mc;
		
	}
	
}