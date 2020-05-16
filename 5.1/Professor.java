package lab.assign5_1;

import java.util.Date;

public class Professor extends DeptEmployee {

	private int numberOfPublications;

	//Constructor with default user defined/Specified values
	public Professor(String name, Date hireDate, double salary, int numberOfPublications) {
		super(name, hireDate, salary);
		this.numberOfPublications = numberOfPublications;
	}
    
	//accessors for the number of publications for a Prof
	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

}