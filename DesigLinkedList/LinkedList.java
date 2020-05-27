package DesigLinkedList;

public class LinkedList
{
	private Node head;
	private int size;
	
	LinkedList()
	{
		this.head = null;
		this.size = 0;
	}
	
	public void addLast(int val)
	{
		if(head == null)
		{
			head = new  Node(val);
		}
		else
		{
			Node temp = head;
			Node newv = new Node(val);
			newv.setNext(temp);
			head = newv;
		}
		
		size++;
	}
	
	public int getData(int index)
	{
		Node temp = head;
		for(int i=0; i<index;i++)
		{
			temp = temp.getNext();
		}
		
		return temp.getValue();
	}
	
	public int getSize()
	{
		return this.size;
	}
	

}
