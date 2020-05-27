package permutaciones;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) 
	{

		LinkedList<Character> conjunto = new LinkedList<Character>();
		
		conjunto.add('a');
		conjunto.add('b');
		conjunto.add('c');
		conjunto.add('d');
		
		Word obj = new Word();
		obj.word2("read;Dear Mr Interviewer, I dreaded the coding test");
		
		
		
		
				
        escribe ("", conjunto);

	}
	
	public static void escribe(String a, LinkedList<Character> conjunto)
	{
		if(conjunto.size() == 1) System.out.println(a+conjunto.get(0));
		
		for(int i= 0; i<conjunto.size();i++)
		{
			Character b = conjunto.remove(i);
			escribe(a+b, conjunto);
			conjunto.add(i,b);
				
		}
		
	}

}
