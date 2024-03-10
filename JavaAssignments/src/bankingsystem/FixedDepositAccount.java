package bankingsystem;

public class FixedDepositAccount extends Account {
	private int depositAmt; //min=1000
	private int tenure; //min=1 + max=7
	private double interestEarned;
	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		interestEarned = 8/100.0*tenure*depositAmt;
	}
	
}
