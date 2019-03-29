package pilasycolas;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		
		list.push(90);
		list.push(30);
		list.push(18);
		list.push(10);

		Pilas obj = new Pilas();
		
		obj.reversar(list);
		
		
		

	}

}
