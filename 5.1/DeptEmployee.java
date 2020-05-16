package lab.assign5_1;

import java.util.Date;

public class DeptEmployee {

	private String name;
	
	private Date hireDate;
	
	private double salary;
	
	//Explicit default constructors
	public DeptEmployee() {}
    
	//Constructor with default user defined/Specified values
	public DeptEmployee(String name, Date hireDate, double salary) {
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
	}
    
	//Methods and accessors(Setters and Getter)
	public String getName() {
		return name;
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
	
	public double computeSalary() {
		return salary;
	}
	
	@Override
	//toString method
	public String toString() {
		return " Name = " + name +", Salary = " + salary + ", Hire Date = " + hireDate ;
	}
}