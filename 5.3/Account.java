

public class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee emp;

	public Account(Employee emp) {
		this(emp, DEFAULT_BALANCE);
	}

	public Account(Employee emp, double balance) {
		this.emp = emp;
		this.balance = balance;
	}

	public void makeDeposit(double deposit) {
		this.balance = balance + deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if (amount > this.balance) {
			System.out.println("Insufficient Balance to Withdraw");
			return false;
		} else {
			this.balance = this.balance - amount;
			return true;
		}

	}

	public String getAcctType() {
		return "To be defined";
	}

	public double computeInterest(Account acct) {

		if (acct.getAcctType() == "CHECKING")
			return balance * 0.02;

		else if (acct.getAcctType() == "SAVINGS")
			return balance * 0.04;

		else
			return balance * 0.05;

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
