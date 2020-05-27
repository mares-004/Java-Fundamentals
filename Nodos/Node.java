package Nodos;

public class Node 
{
	int val;
	Node next;

	Node(int val)
	{
		this.val = val;
		this.next = null;
	}
	
	public int getVal()
	{
		return val;
	}
	
	public void setVal(int val)
	{
		this.val = val;
	}
	
	public Node getNext()
	{
		return this.next;
	}
	public void setNext(Node next)
	{
		this.next = next; 
	}	
	
	public Node LastPos(Node pos)
	{
		while(pos != null)
		{
			pos = pos.getNext();
		}
		
		return pos;
	}
	
	public int convNum(Node num)
	{
		Node aux = num;
		int  val = 0, i =0;
		int mult = 1;
		
		
		
		while(aux != null)
		{
			if(i==0)
			{
				val = aux.getVal();
			}
			else
			{
				val = val + aux.getVal()*mult;
			}
			aux = aux.getNext();
			i++;
			mult = mult*10;
		}
		return val;
	}
	
}