package pilasycolas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class mainfinal {

	public static void main(String[] args) 
	{
		/*
		LinkedList<String> stack = new LinkedList<String>();
		stack.push("Java");
		stack.push("DotNet");
		stack.push("PHP");
		stack.push("HTML");
		
        Iterator i = stack.iterator();
        i.next();
        i.next();
        i.remove();
        System.out.println(i.next());


		Queue<String> queue = new LinkedList<String>();
        queue.offer("Java");
        queue.offer("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        Iterator i = queue.iterator(); // i = null
        i.next(); // i = Java
        i.remove(); // Vuelve el i nulo, por asi decirlo.
        i.next(); //i = DotNet
        i.remove(); // i = null
        //i.remove();
        System.out.println(i.next()); // PHP
        System.out.println(queue.peek());
        
        	
		Hashtable<Integer,String> hTable=new Hashtable<Integer,String>();
		
		HashMap<Integer,String> hMap=new HashMap<Integer,String>();
		
		Set<Entry<Integer,String>> s = hTable.entrySet();
		Iterator<Entry<Integer,String>> it = s.iterator();
		
		Set<Entry<Integer,String>> s1 = hMap.entrySet();
		Iterator<Entry<Integer,String>> it1 = s.iterator();
		
        hTable.put(1, "Java");
      	hTable.put(5, "C++");
       	hTable.put(3, "CoralDraw");
        hTable.put(4, "SE");
      System.out.println(hTable);
      
      */

		int[] numberList = {0, 0, 0, 0, 0, 0};
		int x;
		
		Scanner input = new Scanner(System.in);
		for(x = 0; x < numberList.length; ++x)
		{
		System.out.print("Enter an integer >> ");
		try
		{
		numberList[x] = input.nextInt();
		}catch (InputMismatchException e) {
			System.out.print("Digito no valido");
		}
			
		}
		System.out.print("The numbers are: ");
		for(x = 0; x <=6; ++x)
			try
		{
		System.out.print(numberList[x] + " ");
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.print("puntero no valido");
		}
	}

}
