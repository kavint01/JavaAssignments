package bankingsystem;

public class Customer{
	private static int cId = 100;
	private String cName;
	private int cAge;
	private long cMobNo;
	private String cPassNo;
	private Account acct;
	public Customer(String cName, int cAge, long cMobNo, String cPassNo) {
		Customer.cId++;
		this.cName = cName;
		this.cAge = cAge;
		this.cMobNo = cMobNo;
		this.cPassNo = cPassNo;
	}
	@Override
	public String toString() {
		return "Customer [cId="+cId+", cName=" + cName + ", cAge=" + cAge + ", cMobNo=" + cMobNo + ", cPassNo=" + cPassNo + "]";
	}
	
	public Account getAcct() {
		return acct;
	}
	public void setAcct(Account acct) {
		this.acct = acct;
	}
	public Customer(String cName, int cAge, long cMobNo, String cPassNo, Account acct) {
		super();
		this.cName = cName;
		this.cAge = cAge;
		this.cMobNo = cMobNo;
		this.cPassNo = cPassNo;
		this.acct = acct;
	}
	
}
