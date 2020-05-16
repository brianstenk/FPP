package lab.assign5_1;

import java.util.Date;

public class Administrator extends DeptEmployee {

	private double noOfHoursWorked;
	
	//Constructor with default user defined/Specified values
	public Administrator(String name, Date hireDate, double salary, int noOfHoursWorked) {
		super(name, hireDate, salary);
		this.noOfHoursWorked = noOfHoursWorked;
	}
	//override the compute Salary for Administrator
	@Override
	public double computeSalary() {
		return 20 * noOfHoursWorked;
	}
}