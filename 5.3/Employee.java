

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Employee {

	private ArrayList<Account> accounts;
	private String name;
	private Date hireDate;

	Employee(){}
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		hireDate = cal.getTime();
		accounts = new ArrayList<Account>();
	}

	public void createAccount(String accType, double startAmount) {
		Account acc;
		accType = accType.toUpperCase();
		if (accType.equals("CHECKING")) {
			acc = new Checking(this, startAmount);
			accounts.add(acc);
		} else if (accType.equals("SAVINGS")) {
			acc = new Savings(this, startAmount);
			accounts.add(acc);
		} else if (accType.equals("RETIREMENT")) {
			acc = new Retirement(this, startAmount);
			accounts.add(acc);
		} else
			System.out.println("No such account type. Please Enter again!");
	}

	public void deposit(int acctIndex, double amt) {
		if (amt <= 0) {
			System.out.println("Invalid Deposit Attempt!");
			return;
		}
		Account selectedAccount = (Account) accounts.get(acctIndex);
		selectedAccount.makeDeposit(amt);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public boolean withdraw(int acctIndex, double amt) {

		Account selectedAccount = (Account) accounts.get(acctIndex);
		return selectedAccount.makeWithdrawal(amt);
	}
	
	// TotalOfAllBalances
		public  double totalOfAllBalances(List<Employee> e) {
			Account acct;
			double totalBalance = 0.0;
			for (int i = 0; i < e.size(); i++) {
				for (int j = 0; j < e.get(i).getAccounts().size(); j++) {
					acct = e.get(i).getAccounts().get(j);
					totalBalance += acct.getBalance();
				}
			}
			return totalBalance;
		}

}
