package in.ac.kletech.Bank;

public class BankDemo {

	public static void main(String[] args) {
		Account a=new Account(1234, "Deepika", 5000) ;
		Account f=new Account(5678, "Ruchika", 6000);
		SBIbank s=new SBIbank();
		s.DepositAmt(a, 10000);
		s.WithdrawAmt(a, 1000);
		s.transferAmt(a, f, 3000);

	}

}
