package InterviewAlgh;

import java.util.ArrayList;
import java.util.List;

public class Permutations
{
	public static void permutation(String str)
	{
		List<Character> lst = new ArrayList<Character>();
		
		for(int i=0; i < lst.size(); i++ )
		{
			lst.add(str.charAt(i));
		}
		
		write(lst);
	}

	private static void write(List<Character> lst) {
		
		
	}
}
