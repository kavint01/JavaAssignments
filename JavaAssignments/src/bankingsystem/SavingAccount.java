package bankingsystem;

public class SavingAccount extends Account {
	private boolean isSalaryAcct;
	private int minBal=100;
	private double interestEarned;
	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		interestEarned = 4/100.0*balance;
	}
	
}
