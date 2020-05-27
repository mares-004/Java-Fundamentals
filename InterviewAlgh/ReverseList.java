package InterviewAlgh;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ReverseList 
{
	public static void rev(List ls)
	{
		int i = 0;
		List<Integer> lst2 = new LinkedList<Integer>();
		Stack st1 = new Stack();
		
		while(i < ls.size())
		{
			st1.push(ls.get(i));
			i++;
		}
		while(!st1.isEmpty())
		{
	
			lst2.add((Integer) st1.pop());
			
		}
			
		System.out.println(lst2);
		
	}
	public static void main(String args[])
	{
		List<Integer> lst = new LinkedList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		
		rev(lst);
		
	}

}
