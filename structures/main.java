package structures;

import java.util.Iterator;
import java.util.LinkedList;

public class main {

	public static void main(String[] args)
	{
/*		LinkedList<Integer> lit = new LinkedList();
		LinkedList<Integer> lit2 = new LinkedList();
		LinkedList<Integer> lit3;

		lit.add(7);
		lit.add(5);
		lit.add(9);
		lit.add(4);
		lit.add(6);
		
		lit2.add(8);
		lit2.add(4);

		structure obj = new structure();
		
		lit3 = obj.crear(lit, lit2);
		
		Iterator it = lit3.descendingIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		*/
		
		int[] vec = {1,2,3,4,5,6,7};
		int val = 3;
		
		BinarySearch obj = new BinarySearch();
		System.out.println("Resultado: " + obj.search(vec, val));
		
		/*
		Hash_Set obj = new Hash_Set();
		
		obj.Cadena("bbccddaaaarrrnnnnnvvvvzzzxxxxllll");
		*/
	
	}

}
