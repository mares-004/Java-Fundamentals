package pilasycolas;

import java.util.Iterator;
import java.util.LinkedList;

public class Pilas 
{
	public void reversar(LinkedList<Integer> list)
	{
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		Integer comp=0;
		
		comp = list.peek();
		
		Iterator<Integer> it = list.iterator();
		Integer temp;
		Integer temp2;
		
		while(it.hasNext())
		{
			temp = it.next();
			list2.push(temp);
		}
		
		Iterator<Integer> it2 = list2.iterator();
		
		while(it2.hasNext())
		{
			temp2 = it2.next();
			if(temp2==comp)
			{
				System.out.println("and " + temp2);
			}
			else
			{
				System.out.println(temp2);
			}
		}
		
		
		
	}

}
