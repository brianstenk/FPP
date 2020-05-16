

public class Checking extends Account {
	private static final int SERVICE_CHARGE = 5;

	public Checking(Employee employee, double balance) {
		super(employee, balance);

	}

	public String getAcctType() {
		return "CHECKING";
	}

	public double getBalance() {
		double baseBalance = super.getBalance();
		return baseBalance = baseBalance - SERVICE_CHARGE;
		
	}

}
