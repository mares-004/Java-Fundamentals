package DesigLinkedList;

public class Main {

	public static void main(String[] args)
	{
		
		/*LinkedList obj = new LinkedList();
		int i = 0;
		
		obj.addLast(0);
		obj.addLast(1);
		obj.addLast(2);
		obj.addLast(3);
		
		while(i < obj.getSize())
		{
			System.out.println(obj.getData(i));
			i++;
		}*/
		
		LinkedListF obj = new LinkedListF();
	
		obj.add(10);
		obj.add(20);
		obj.add(30);
		
		int i =0;
		while(i < obj.getSize())
		{
			System.out.println(obj.getValue(i));
			i++;
		}
		
		

	}

}
