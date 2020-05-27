package LamdaExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Main
{

	public static void main(String[] args)
	{
		/*
		Employee[] emp = {new Employee("Correa", "Julie", 50000), new Employee("Alvarez", "Mauro", 50000),
						  new Employee("Perez", "Jorge", 50000),  new Employee("Rua", "Pedro", 50000),
						  new Employee("Dios", "Pablo", 50000),  new Employee("Silva", "Maria", 50000),
						  new Employee("Quintero", "Mel", 50000),  new Employee("Rios", "Juan", 50000),
						  new Employee("Gil", "Mary", 50000), new Employee("Perez", "Mia", 50000)};
		
		List<Employee> lst = Arrays.asList(emp);
		
		System.out.println("\n" + 
					 lst.stream().filter(e->e.firstname.startsWith("M") || e.firstname.startsWith("P") )
					.map(Employee::toString)
					.collect(Collectors.joining("--")));
	
		 lst.stream().filter(e->e.firstname.startsWith("M") || e.firstname.startsWith("P") )
						.map(Employee::toString)
						.limit(4)
						.sorted()
						.forEach(System.out::println);

		 System.out.println(lst.stream().filter(e->e.firstname.startsWith("M") || e.firstname.startsWith("P") )
			.mapToDouble(Employee::getSalary)
			.average()
			.getAsDouble());*/
		
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(1);
		lst.add(10);
		lst.add(11);
		lst.add(8);
		lst.add(12);
		
		System.out.println(lst.stream().filter(x->x.equals(10)).count());
		
		
		 
		 
		

					

	}

}
