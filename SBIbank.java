package in.ac.kletech.Bank;

public class SBIbank extends Bank {
	void DepositAmt(Account a, double dAmount) 
	{
		a.dBalance=a.dBalance+dAmount;
		System.out.println("The balance of account holder :"+a.sName+" after the deposit is: Rs."+a.dBalance);
	}

	void WithdrawAmt(Account a, double dAmount) 
	{
		a.dBalance=a.dBalance-dAmount;
		System.out.println("The balance of account holder :"+a.sName+" after the withdrawal is: Rs."+a.dBalance);
	}

	boolean transferAmt(Account a, Account f, double dAmount) 
	{
		a.dBalance=a.dBalance-dAmount;
		f.dBalance=f.dBalance+dAmount;
		System.out.println("The balance of account holder :"+a.sName+" after the transfer is: Rs."+a.dBalance);
		System.out.println("The balance of account holder :"+f.sName+" after the transfer is: Rs."+f.dBalance);
		return true;
	}
	

}
