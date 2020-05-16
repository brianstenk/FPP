

public class Savings extends Account {
	private static final float INTEREST_RATE=0.25f;
	
	public Savings(Employee employee, double balance) {
		super(employee, balance);

	}
	public String getAcctType() {
		return "SAVINGS";
	}

	public double getBalance() {
		double baseBalance = super.getBalance();
		double interest = (INTEREST_RATE/100)*baseBalance;
		return baseBalance + interest;
	}

}
