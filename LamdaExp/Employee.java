package LamdaExp;

public class Employee
{
	String lastname;
	String firstname;
	double salary;
	
	public Employee(String lastname, String firstname, double salary)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return this.salary + "-" + this.getFirstname() + "-" + this.getLastname();
	}
	

}
