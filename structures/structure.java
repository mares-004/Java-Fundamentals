package structures;

import java.util.Iterator;
import java.util.LinkedList;

public class structure 
{
	
	public Integer listar(LinkedList lit)
	{
	Integer sum, aux, i =0;

	Iterator it = lit.descendingIterator();
	
	sum = 0;
	
	while(it.hasNext())
	{
		aux = Integer.parseInt(it.next().toString());
		
		if(i==0)
		{
			sum = aux * 10 ;
		}
		else
		{
			sum = sum + aux;
			sum = sum * 10;
		}
		i = i+1;
	}
	
	sum = sum/10;
	
	return sum;
	
	}
	

	public LinkedList<Integer> crear(LinkedList l1, LinkedList l2)
	{
		Integer aux, dig =0;
		
		aux = listar(l1) + listar(l2);
		
		LinkedList<Integer> list = new LinkedList();
		
		while(aux > 0)
		{
			list.add(aux%10);
			aux = aux/10;
		}
		
		return list;
		
		
	}
	

}
