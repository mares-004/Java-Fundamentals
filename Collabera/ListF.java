package Collabera;

import java.util.ArrayList;
import java.util.List;

public class ListF
{
	public static class Node
	{
		Node next;
		int value=0;
		
		public Node(int value)
		{
			this.value=value;
			this.next = null;
		}
		
		public Node getNext()
		{
			return this.next;
		}
		public int getValue()
		{
			return this.value;
		}
		public void setNext(Node n)
		{
			this.next = n;
		}
	}
	
	public static class ListNode
	{
		private Node head, front;
		private int size;
		
		ListNode()
		{
			head=null;
			front = null;
			size =0;
		}
		
		public void addNode(int value)
		{
			if(head == null)
			{
				head = new Node(value);
				front = head;
			}
			else
			{
				Node newn = new Node(value);
				front.setNext(newn);
				front = newn;
			}
			size++;
		}
		
		public int getValue(int index)
		{
			Node it = head;
			for(int i=0; i<index;i++)
			{
				it = it.next;
			}
			
			return it.getValue();
		}
		
		public int getSize()
		{
			return this.size;
		}
	
	}
	
	public static void main(String[] args)
	{
		ListNode list = new ListNode();
		
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		
		for(int i=0; i < list.getSize(); i++)
		{
			System.out.println(list.getValue(i));
		}
		
		List<String> lst = new ArrayList<String>();
		
		lst.add("Cristian");
		lst.add("Pablo");
		lst.add("Carlos");
		lst.add("Juana");
		lst.add("Carol");
		lst.add("Sol");
		
		lst.stream().filter(a-> a.startsWith("C")).limit(5).sorted().forEach(System.out::println);
		
		
		
		
	}
	
	

}
