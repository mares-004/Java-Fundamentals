package InterviewAlgh;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class ClassicsAlg
{
	public static boolean contener(String uno, String dos)
	{
		String aux2 = "";
		
		Boolean resp = true;
		
		for(int i =0; i < uno.length(); i++)
		{
			aux2 += uno.charAt(i);
			
			if(!dos.contains(aux2))
			{
				resp = false;
			}
			aux2 = "";
		}
		
		return resp;
	}
	
	public static void subs(String s)
	{
		String aux = "";
		String res = "";
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
 
		
		for(int i=0; i < s.length(); i++)
	    {
			aux+= s.charAt(i);

			if(!res.contains(aux))
		       {
					res+= s.charAt(i);
		       }
			aux = "";
	    }
		
		aux = "";
		
		for(int x=0; x< s.length(); x++)
		{
			aux += s.charAt(x);
			
			for(int y=x+1; y< s.length()-1; y++)
			{
				aux+= s.charAt(y);
				
				if(contener(res, aux))
				{
					map.put(aux.length(), aux);
				}
				
			}
			aux = "";
		}
		
		Integer min = 99999;
		Integer val = 0;
		
		Iterator it = map.entrySet().iterator();
		Map.Entry mapE2 = null;
		
		while(it.hasNext())
		{
			Map.Entry mapE1 = (Map.Entry)it.next();
			val = (Integer) mapE1.getKey();
			
			if(val < min)
			{
				min = val;
				mapE2 = mapE1;
			}
		}
		
		System.out.println(mapE2.getValue());
		
	}
	
	public static int fibonaci(int num)
	{
		if(num <= 1) return num;
		
		return fibonaci(num -1) + fibonaci(num - 2);
	}
	
	public static int factorial(int num)
	{
		if(num <= 1) return 1;
		
		return num * factorial(num - 1);
	}
	
	public static String reverse(String str)
	{
		if(str.length() == 1) return str;
		
		String sub = str.substring(1, str.length());
		
		return reverse(sub) + str.charAt(0);
	}
	public static int bSearch(int[] vec, int key)
	{
		int iMin = 0;
		int pos = 0;
		int iMax = vec.length-1;
		
		while(iMin < iMax) 
		{
			pos = (iMin + iMax)/2;
			
			if(key < vec[pos])
			{
				iMax = pos;
			}
			else if(key > vec[pos]) 
			{
				iMin = pos;
			}
			else 
			{
				break;
			}
		}
		
		return pos;
	
	}
	
	public static boolean isPalindrome(String input) 
	{
		if(input.equals(null)) return true;
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i = input.length()-1; i >= 0; i--)
		{
			sb.append(input.charAt(i));
		}
		
		String reverse = sb.toString();
		
		return input.equals(reverse);
		
    }
	
	public static boolean amstrong(int val)
	{
		if(val < 10) return false;
		
		int res =0;
		int mod = 0;
		int num = val;
		boolean flag = false;
		
		while(num > 0)
		{
			mod = num%10;
			num = num/10;
			
			res+= mod*mod*mod;
			
			if(num<10)
			{
				res+= num*num*num;
				num = 0;
			}
		}
		
		if(res == val) return true;
		else return false;

	
	}
	
	public static void WithOutDuplicates(List<Integer> lst)
	{
		System.out.println("Original" + lst);
		
		Set<Integer> lstWO = new LinkedHashSet<Integer>(lst);
		
		lst.clear();
		
		lst.addAll(lstWO);

		System.out.println("WithOut" + lst);		
		
	}
	
	public static String incString(String str)
	{
		String res = "";
		String result = "";
		int j = str.length()-1;
		
		Integer num = 0;
		
		for(int i = str.length()-1; i >= 0; i--)
		{
			
			if(Character.isDigit(str.charAt(i)))
			{
				res= str.charAt(i) + res;
			}
			
			if(!Character.isDigit(str.charAt(j-i)))
			{
				result+= str.charAt(j-i);
			}

		}
		
		num = Integer.parseInt(res);
		num += 1;
		
		result += Integer.toString(num);
		
		return result;
	}
	
	public static List<Employee> fillEmployee()
	{
		List<Employee> lst = new ArrayList<Employee>();
		
		lst.add(new Employee("Carlos", 1, 18,100000, "Sales"));
		lst.add(new Employee("Juan", 2, 22,120000, "IT"));
		lst.add(new Employee("Pedro", 5, 41,180000, "Sales"));
		lst.add(new Employee("Luis", 6, 30,190000, "Marketing"));
		lst.add(new Employee("Maria", 8, 18, 1200, "Sales"));
		lst.add(new Employee("Silvia", 9, 22,200000,  "IT"));
		lst.add(new Employee("Ana", 22, 28,130000, "IT"));
		lst.add(new Employee("Sofia", 22, 33,250000, "Marketing"));

		return lst;
	}

	public static void filterName(List<Employee> lst, int id)
	{
		lst.stream().filter(a->a.id == id).forEach(System.out::print);
		
	}

	public static void averageAge(List<Employee> lst)
	{
		System.out.println(lst.stream().mapToDouble(Employee::getEdad).average().getAsDouble());
	}
	
	public static void employeeByAge(List<Employee> lst, int age)
	{
		lst.stream().filter(e->e.edad == age).forEach(System.out::print);
	
	}
	
	public static void orderById(List<Employee> lst)
	{

		Comparator<Employee> comparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee left, Employee right)
		{
			return left.getEdad()-right.getEdad();
		}
		};
		
		Collections.sort(lst, comparator);
		

		System.out.println(lst);
		
	}

	public static void orderByIddos(List<Employee> lst)
	{

		Function<Employee, String> byName = e -> e.getName();
		
		Comparator<Employee> nameComp = Comparator.comparing(byName);
		
		lst.stream().sorted(nameComp).forEach(System.out::println);
		
	}
	
	public static void orderByIdtres(List<Employee> lst)
	{
		Function<Employee, Integer> byId = e -> e.getId();
		Comparator<Employee> comparatorId = Comparator.comparing(byId);
		
		lst.stream().sorted(comparatorId).forEach(System.out::println);
		
		Comparator<Employee> comparatorId2 = new Comparator<Employee>() {
			@Override
			public int compare(Employee left, Employee right)
			{
				return left.getId() - right.getId();
			}
		};
		
		Collections.sort(lst,comparatorId2 );
	}
	
	public static void Comp(int n, int k, String s1, String s2)
	{
		if(s2.contains(s1))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
		
	}
	

	public static void main(String args[])
	{
		
		
		Comp(3, 7, "anal", "peruana");
		
		
		//filterName(fillEmployee(), 22);
		//averageAge(fillEmployee());
		//employeeByAge(fillEmployee(), 22);
		
		//orderByIddos(fillEmployee());
		
		
		
		
		
		/*
		
		subs("dabbcabcd");
				 		 
		System.out.println(incString("str19"));
		 
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		 

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		
		WithOutDuplicates(list);
		 
		System.out.println("Amstrong: " + amstrong(29));
				 
		System.out.println("isPal: " + isPalindrome("ana"));
		int[] array = {1,2,4,5,8,9};
		
		System.out.println("bSearch Pos: " + bSearch(array, 8));
		
		System.out.println("Fibo: " + fibonaci(10));
		
		System.out.println("isPal: " + isPalindrome("ana"));
		
		System.out.println("Fact: " + factorial(10));
		
		System.out.println("Reverse: " + reverse("hola"));
		*/
		
		
	}
}
