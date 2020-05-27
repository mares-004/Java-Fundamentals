package InterviewAlgh;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//import lambdas_Streams.Employee;

public class main {

	public static void main(String[] args)
	{
		List<Employee> lst = new ArrayList<Employee>();
		
		lst.add(new Employee("Mario", 1, 20, 100, "IT"));
		lst.add(new Employee("Maria", 15, 25, 800, "Sales"));
		lst.add(new Employee("Juan", 4, 15, 600,  "IT"));
		lst.add(new Employee("Carlos", 2, 18, 500, "IT"));
		lst.add(new Employee("Mada", 11, 12, 300, "Sales"));
		
		lst.stream().filter(a->a.getEdad() > 18).map(Employee::getName).forEach(System.out::println);
		
		Long valor = null;
	    Optional<Long> opt = Optional.ofNullable(valor);  // Creamos un Optional, pasando un null
	    
	    Function<Employee, Double> bySalary = e -> e.getSalary();
	    Comparator<Employee> salary = Comparator.comparing(bySalary);
	    
	    lst.stream().filter(a->a.getName().startsWith("M")).sorted(salary).forEach(System.out::println);
	    
	    Map<String, Long> employeeCountByDepartment =
	    		lst.stream().collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.counting()));
	    
	    employeeCountByDepartment.forEach((department, count) -> System.out.printf("%s%d", department, count));
	    
	    


	    System.out.println(opt);
		
		
		

	}

}
