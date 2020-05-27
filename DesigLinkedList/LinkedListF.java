package DesigLinkedList;

public class LinkedListF
{
	Node front;
	Node head;
	int size;
	
	LinkedListF()
	{
		this.front= null;
		this.size=0;
	}
	
	public void add(int val)
	{
		if(front == null)
		{
			Node newn = new Node(val);
			this.front = newn;
			this.head= newn;
		}
		else
		{
			Node temp = front;
			Node newf = new Node(val);
			temp.setNext(newf);
			front = newf;
		}
		
		this.size++;
	}
	
	public int getValue(int index)
	{
		int l = 0;
		Node itr = this.head;
		
		while(l < index)
		{
			itr = itr.next;
			l++;
		}
		
		return itr.getValue();
		
		
	}
	
	public int getSize()
	{
		return this.size;
	}
	
	
	

}
