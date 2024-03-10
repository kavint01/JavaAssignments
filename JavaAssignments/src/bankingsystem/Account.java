package bankingsystem;

public abstract class Account {
	protected long accountNumber;
	protected long bsbCode;
	protected String bankName;
	protected double balance;
	protected String openDate;
	public Account() {
		super();
	}
	public Account(long accountNumber, long bsbCode, String bankName, double balance, String openDate) {
		super();
		this.accountNumber = accountNumber;
		this.bsbCode = bsbCode;
		this.bankName = bankName;
		this.balance = balance;
		this.openDate = openDate;
	}
	public abstract void calculateInterest();
}
