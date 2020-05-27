package Collabera;

import java.util.TreeMap;

public class Collabera 
{
	public static int fibonaci(int num)
	{
		if(num <= 1) return num;
		else return fibonaci(num -1) + fibonaci(num - 2);
	}
	
	public static int factorial(int num)
	{
		if(num == 0) return 1;
		else
			return num * factorial(num-1);
	}
	
	// abc
	public static String reverse(String s)
	{
		if(s.length() == 1)
		{
			return s;
		}
		
		String com = s.substring(1,s.length());
		
		// a
		//ba
		//cba
		return reverse(com) + s.charAt(0);
		
	}

	public static void main(String[] args)
	{
		TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
		
		try
		{
		tree.put(1, "Casa");
		tree.put(1, "Carro");
		}
		catch(ArrayIndexOutOfBoundsException excepcion)
		{
			System.out.println("Error");
		}
		finally
		{
			System.out.println("Finaly");
		}
		
		System.out.println(tree.get(1));
		
		System.out.println("Fibonaci: " + fibonaci(10));
		System.out.println("Factorial: " + factorial(3));
		System.out.println("Reverse String: " + reverse("abc"));
		
		
		
	}

}
