package structures;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Hash_Set 
{
	public void Cadena(String str)
	{
        Set<Character> set = new TreeSet<Character>(); 

		
		for(int i =0; i < str.length(); i++)
		{
			set.add(str.charAt(i));
		}
		
		System.out.println(set);
		
	}

}
