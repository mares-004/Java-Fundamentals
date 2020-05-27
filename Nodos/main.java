package Nodos;

public class main {

	public static void main(String[] args) 
	{
		
		Node first = new Node(5);
		first.next = new Node(6);
		first.next.next = new Node(3);

		Node second = new Node(8);
		second.next = new Node(4);
		second.next.next = new Node(2);
		
		Node result = addNumbers(first, second);
		
		while(result!=null)
		{
			System.out.println(result.getVal());
			result = result.getNext();
		}
		

	}
	public static int convNum(Node num)
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
	
	public static Node addNumbers(Node first, Node second)
	{
		int num = 1;
		boolean bFlag;
		
		
		Node res = null, car = null, ant = null;
		
		num = convNum(first) + convNum(second);
		
		System.out.println(num);
		
		bFlag = true;
		
		while(num != 0)
		{
			if(bFlag)
			{
				res = new Node(num%10);
				ant = res;
				bFlag = false;
			}
			else
			{
				car = new Node(num%10);
				ant.next = car;
				ant = ant.next;
			}
			num = num/10;
			
		}
		
		return res;
		
	}

}
