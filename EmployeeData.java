public class EmployeeData {
		private String fullName = null;
		private String ssn = null;
		private double salary = 00.00;


	public EmployeeData (String fullName, String ssn, double salary) {
		this.fullName = fullName;
		this.ssn = ssn;
		this.salary = salary;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	String getFullName() {
		return fullName;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	String getSsn() {
		return ssn;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	double getSalary() {
		return salary;
	}

	public String toString() {
		return fullName + "\t" + ssn.replaceAll("^[0-9]{5}", "xxxxx") + "\t" + salary + "\t"; //this format masks most of the SSN (so it isn't public to whoever is viewing the table)
	}

	boolean equals(EmployeeData employee) {
		return this.fullName == employee.getFullName() && this.ssn == employee.getSsn()
				&& this.salary == employee.getSalary();
	}

}
