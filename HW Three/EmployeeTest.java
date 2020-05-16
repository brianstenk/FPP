package classesAndObject;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Carl", "Smith",75000,1987, 12,15);
		staff[1] = new Employee("Harry", "Brian", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony", "Jean", 40000, 1990, 3, 15);

		for(Employee e : staff) {
			e.raiseSalary(5);
		}

		for(Employee e : staff) {
			System.out.println("Name = "+e.getName() +
					", Salary = "+e.getSalary() +
					", Hire day = "+e.getHireDay());
		}
		
		System.out.println();
		for(Employee e : staff) {
			System.out.println("Name = "+e.getName() +
					", Salary = "+e.getSalary() +
					", Yearly Federal Tax = "+e.yearlyFederalTax());

	}
		Employee employeeJaneRose = new Employee("Jane", "Rose",75000,1987, 12,15);
		Account jane_SavingsAccount = new Account(employeeJaneRose, AccountType.SAVINGS, 300);
		Account jane_RetirementsAccount = new Account(employeeJaneRose, AccountType.RETIREMENT, 300);
		Account jane_CheckingAccount = new Account(employeeJaneRose, AccountType.CHECKING, 300);
		
		System.out.println();
		System.out.println(jane_SavingsAccount.toString());
		System.out.println(jane_RetirementsAccount.toString());
		System.out.println(jane_CheckingAccount.toString());
		
		System.out.println();
		
		System.out.println("Name = "+employeeJaneRose.getName() +
				", Salary = "+employeeJaneRose.getSalary() +
				", Yearly Federal Tax = "+employeeJaneRose.yearlyFederalTax());
	}
}