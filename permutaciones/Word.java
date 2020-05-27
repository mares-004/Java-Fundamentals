package permutaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Word
{
	public void word2(String s)
	{
		int res = -1;
		List<Integer> lst = new ArrayList<Integer>();
		
		String[] array = s.split(";");
		
		String token = array[0];
		
		for(int i=1; i < array.length; i++)
		{
			lst = verify(token, array[i]);
			
			System.out.println(lst);
		}
		
	}
	
	public List<Integer> verify(String word1, String word2)
	{

		int l =0;
		int aux=0, index =0, lg =0;
		List<Integer> lstAux = new ArrayList<Integer>();
		
		word1 = word1.toUpperCase();
		word2 = word2.toUpperCase();
		
		String[] arrayAux = word2.split(" ");
		
		for(int y=0; y < arrayAux.length; y++)
		{
			index = 0;
			for(int x=0; x < word1.length(); x++)
			{
			
				l = arrayAux[y].indexOf(word1.charAt(x));
				if(l>=0 && aux == 0)
				{
					index = l;
					aux = 1;
					lg = 0;
				}
				else if(l < 0)
				{
					index = -1;
					break;
				}
			}
			
			if(y==0 && index != -1)
			{
				lstAux.add(0);
				lg = lg + arrayAux[y].length() + 1;
			}
			else if(y==0 && index == -1)
			{
				lstAux.add(index);
				lg = lg + arrayAux[y].length() + 1;
			}
			else if(y > 0 && index != -1)
			{
				lstAux.add(lg);
				lg = lg + arrayAux[y].length() + 1;				
			}
			else if(y > 0 && index == -1)
			{
				lg = lg + arrayAux[y].length() + 1;
				lstAux.add(-1);
			}
			
		}
		
		return lstAux;
	}

}
