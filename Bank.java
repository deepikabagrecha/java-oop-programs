package in.ac.kletech.Bank;

abstract public class Bank {
	abstract void DepositAmt(Account a,double dAmount);
	abstract void WithdrawAmt(Account a,double dAmount);
	abstract boolean transferAmt(Account f,Account t,double dAmount);	
}
