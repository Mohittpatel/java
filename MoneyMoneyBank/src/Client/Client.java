package Client;

import com.tnsif.application.*;
import com.tnsif.framework.*;

public class Client
{
	public static void main(String[] args) 
	{
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(12452, "mahi", 4586521, true);
		CurrentAcc ca = new MMCurrentAcc(25754, "Mohit Patel", 45865, 500000);
		
		sa.withdraw(488744);
		
	}

}