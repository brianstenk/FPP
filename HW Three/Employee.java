package classesAndObject;

import java.util.Date;
import java.util.GregorianCalendar;
	class Employee {
		
		//instance fields
		private String name;
		private String nickName;
		private double salary;
		private Date hireDay;
		private double federalTax;
		
		//constructor
		Employee(String aName,String aNickName,
						double aSalary,int aYear,
						int aMonth,int aDay) 
		{
		name = aName;
		nickName = aNickName;
		salary = aSalary;

		GregorianCalendar cal =
				new GregorianCalendar(aYear,aMonth-1,aDay);
		hireDay = cal.getTime();
		}

		// instance methods
		public String getName() {
			return name;
		}

		public String getNickName() {
			return nickName;
		}

		public void setNickName(String aNickName) {
			nickName = aNickName;
		}
		public double getSalary() {
			return salary;
		}

		//needs to be improved!!
	/*
	 * public Date getHireDay() { return hireDay; }
	 */
		public String getHireDay() {

			return String.format("%1$tB %1$te, %1$tY", hireDay);
		}



		public void raiseSalary(double byPercent) {
			double raise = salary * byPercent / 100;
			salary += raise;
		}
		
		public double yearlyFederalTax () {
			
			//for(Employee e : S)
			if (salary > 80000) {
				federalTax = salary * 28/100;
			}
			else if (salary > 50000 && salary <= 80000) {
				federalTax = salary * 24/100;
			}
			else if (salary > 26000 && salary <= 50000) {
				federalTax = salary * 20/100;
			} else {
				federalTax = 0;
			}
			
			return federalTax;
		}
	}
	
	
	




