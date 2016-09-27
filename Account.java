package in.ac.kletech.Bank;

public class Account {
	int iAccNo;
	String sName;
	double dBalance;
	
	
	public Account(int iAccNo, String sName, double dBalance) 
	{
		this.iAccNo = iAccNo;
		this.sName = sName;
		this.dBalance = dBalance;
	}


	public int getiAccNo() {
		return iAccNo;
	}


	public String getsName() {
		return sName;
	}


	public double getdBalance() {
		return dBalance;
	}
	
	
}
