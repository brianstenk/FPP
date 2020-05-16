package lab.assign5_1;

import java.util.Date;

public class Secretary extends DeptEmployee {

	private double overtimeHours;
	
	//Constructor with default user defined/Specified values
	public Secretary(String name, Date hireDate, double salary, int overtimeHours) {
		super(name, hireDate, salary);
		this.overtimeHours = overtimeHours;
	}

	//Getters and Setters
	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	//Compute salary method for secretary
	@Override
	public double computeSalary() {
		return super.computeSalary() + 12 * overtimeHours;
	}
}