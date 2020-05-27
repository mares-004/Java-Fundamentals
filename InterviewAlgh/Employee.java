package InterviewAlgh;

public class Employee
{
	String Name;
	String department;
	int id;
	int edad;
	double salary;
	public String getName() {
		return Name;
	}
	
	Employee(String name, int id, int edad, double salary, String department)
	{
		this.Name=name;
		this.id=id;
		this.edad=edad;
		this.salary=salary;
		this.department = department;
	}
	
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
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
		return this.id + "-" + this.Name + "-" + this.edad + "-" + this.salary;
	}
	
}



