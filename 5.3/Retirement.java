

public class Retirement extends Account{
	private static final float PENALITY=2;
	
	public Retirement(Employee employee, double balance) {
		super(employee, balance);

	}
	public String getAcctType() {
		return "RETIREMENT";
	}

	public double getBalance() {
		double baseBalance = super.getBalance();
		double penality = (PENALITY/100)*baseBalance;
		return baseBalance - penality;
	}

}
