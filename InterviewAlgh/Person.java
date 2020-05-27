package InterviewAlgh;

import java.util.HashMap;

public class Person {
private String name;
private String id;

public Person(String name, String id)
{
	this.name = name;
	this.id= id;
}

public static void main(String args[])
{
	HashMap<Person, String> map = new HashMap<>();
	
	Person per1 = new Person("Paolo", "1");
	Person per2 = new Person("Paolo", "1");
	
	map.put(per1, "Person1");
	
	System.out.println(map.get(per2));
	
	
	}

}
