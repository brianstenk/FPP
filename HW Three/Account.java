package classesAndObject;

public class Account {
	/* These global constants that are declared static and final can be taken to enum class
	 * public final static String CHECKING = "checking"; public final static String
	 * SAVINGS = "savings"; public final static String RETIREMENT = "retirement";
	 */
	private final static double DEFAULT_BALANCE = 0.0;
	
	private double balance;

	public Employee getEmployee() {
		return employee;
	}

	private AccountType acctType;
	private Employee employee; // assn

	Account(Employee emp, AccountType acctType, double balance){
		setEmployee(emp);
		this.acctType = acctType;
		this.balance = balance;
	}

	private void setEmployee(Employee emp) {
		this.employee = emp;
	}
	
	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}

	Account(Employee emp, AccountType acctType){
		this(emp,acctType,DEFAULT_BALANCE);
	}
	
	/*
	 * String newline = System.getProperty("line.separator");
	 * 
	 * String ret = "Account type: "+acctType+newline+ "Current bal:  "+balance;
	 * return ret;
	 */
	public String toString() {
		return "The type of account is:  "+acctType+", and the balance is : "+balance;
	}
	public void makeDeposit(double deposit) {
		//implement
		balance += deposit;
	}
	public boolean makeWithdrawal(double amount) {
		//implement
		
		if (balance < amount ) return false;
		
		 balance -= amount;
		
		return true;
	}

	public double computeInterest() {
		double interest = 0;
		if (acctType == AccountType.CHECKING)
			interest = balance * 0.02;
		else if (acctType == AccountType.SAVINGS)
			interest = balance * 0.04;
		else if (acctType == AccountType.RETIREMENT)
			interest = balance * 0.05;
		return interest;
	}
}
