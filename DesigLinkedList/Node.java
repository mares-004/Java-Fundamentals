package DesigLinkedList;

public class Node 
{
	int value;
	Node next;
	
	Node(int value)
	{
		this.value = value;
		this.next = null;
	}
	
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	

}
