package lab.assign5_1;

import java.util.Date;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		DeptEmployee prof1 = new Professor("Brian", new Date(), 10000, 10);
		DeptEmployee prof2 = new Professor("Elly", new Date(), 20000, 10);
		DeptEmployee prof3 = new Professor("Tom", new Date(), 30000, 10);

		DeptEmployee sec1 = new Secretary("Sam", new Date(), 20000, 200);
		DeptEmployee sec2 = new Secretary("John", new Date(), 30000, 200);

		DeptEmployee[] department = new DeptEmployee [5];
		department[0] = prof1;
		department[1] = prof2;
		department[2] = prof3;
		department[3] = sec1;
		department[4] = sec2;

		//Does the User need the some of all Salaries prompt
		System.out.print("Do you need the sum of all salaries(Y/N)? ");
		Scanner sc = new Scanner(System.in);
		String c = sc.nextLine();
		if (c.length() > 0 && c.equalsIgnoreCase("y")) {
			double totalSalary = 0;

			for (int i = 0; i < department.length; i++) { DeptEmployee employee =
					department[i]; totalSalary += employee.computeSalary(); }
			System.out.println("Total Computed Salary = " + totalSalary);
		}

		//Ask the user if he/she would like to search for the details of an employee
		System.out.print("Do you need to search for the details of an employee(Y/N)? ");
		String ans = sc.nextLine();
		if (ans.length() > 0 && ans.equalsIgnoreCase("y")) {
			System.out.print("Enter the Person you want to search by first name e.g. Brian: ");	  

			String personOfInterest =  sc.nextLine();

			for (int i = 0; i < department.length; i++) {
				DeptEmployee employee = department[i];
				if (employee.getName().equalsIgnoreCase(personOfInterest.trim())) {
					System.out.println("Found " + employee.toString());
				}
			}
		}
		sc.close();
	}
}