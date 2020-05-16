

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	static List<Employee> empList = new ArrayList<Employee>();

	public static void main(String[] args) {
        //empList.add(new Employee("Brian James", 1990, 3, 7));
		// Create Employee Accounts
		Employee emp = new Employee("Brian James", 1999, 8, 8);
		empList.add(emp);
		emp.createAccount("SAVINGS", 100000);
		emp.createAccount("CHECKING", 900000);
		
		emp = new Employee("Joe Doe", 1986, 5, 10);
		empList.add(emp);
		emp.createAccount("SAVINGS", 200000);
		emp.createAccount("CHECKING", 15000);
		

		emp = new Employee("Peter Moses", 1964, 9, 9);
		empList.add(emp);
		emp.createAccount("RETIREMENT", 100000);
		emp.createAccount("CHECKING", 96000);
		

		// Total of All Balances
		emp = new Employee();
		System.out.printf("Total of All Balances %,.2f", emp.totalOfAllBalances(empList));

		System.out.println("\n===Enter Option You Want to Perform===");
		Scanner sc = new Scanner(System.in);
		System.out.println("A : To see a report of all accounts.");
		System.out.println("B : To make a deposit.");
		System.out.println("C : To make a withdrawal.");
		System.out.print("Make a selection (A/B/C): ");

		String option = sc.next();
		if (option.equalsIgnoreCase("a")) {
			for (int i = 0; i < empList.size(); i++) {
				System.out.println("Name:" + empList.get(i).getName());
				for (int j = 0; j < empList.get(i).getAccounts().size(); j++) {
					Account acct = empList.get(i).getAccounts().get(j);
					System.out.printf("Account Type:" + acct.getAcctType() + "\nCurrent bal: %,.2f%n",
							acct.getBalance());
				}
				System.out.println(" ");
			}
		} else if (option.equalsIgnoreCase("b") || option.equalsIgnoreCase("c")) {
			for (int i = 0; i < empList.size(); ++i) {
				System.out.printf("%d. %s\n", i, empList.get(i).getName());
			}
			System.out.print("Select an employee by entering a number) ");
			int option2 = sc.nextInt();

			if (0 <= option2 && option2 < empList.size()) {

				ArrayList<Account> empAccList = empList.get(option2).getAccounts();
				for (int i = 0; i < empAccList.size(); ++i) {
					System.out.printf("%d. %s\n", i, empAccList.get(i).getAcctType());

				}

				System.out.print("Select an account type by entering a number) ");
				System.out.println("");
				int option3 = sc.nextInt();
				if (0 <= option3 && option3 < empAccList.size()) {
					String transacType = option.equalsIgnoreCase("b") ? "Deposit"
							: option.equalsIgnoreCase("c") ? "Withdrawal" : "";
					System.out.print(transacType + " amount: ");
					double option4 = sc.nextDouble();
					if (transacType.equals("Deposit")) {
						empList.get(option2).deposit(option3, option4);
						System.out.printf("\n$%,.2f has been deposited in the %s account of %s", option4,
								empAccList.get(option3).getAcctType(), empList.get(option2).getName());
					} else {
						if (empList.get(option2).withdraw(option3, option4))
							System.out.printf("\n$%,.2f has been withdrawn from the %s account of %s", option4,
									empAccList.get(option3).getAcctType(), empList.get(option2).getName());
					}
				}
			}
		}
		sc.close();

	}
}