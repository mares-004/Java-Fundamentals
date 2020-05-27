package InterviewAlgh;

import java.util.*;

public class ClassicsAlgh
{
	
	public static boolean brackets(String str)
	{
		int cont1 = 0, cont2= 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0,  sum = 0;
		Character c;
		
		for(int i=0; i < str.length(); i++)
		{		
			c = str.charAt(i);
			
			if(c == '[')
			{
				cont1++;
			}
			else if(c == ']')
			{
				cont2--;
			}
			else if(c == '{')
			{
				cont3++;
			}
			else if(c == '}')
			{
				cont4--;
			}	
			else if(c == '(')
			{
				cont5++;
			}
			else if(c == ')')
			{
				cont6--;
			}				
		}
		
		sum = cont1 + cont2 + cont3 + cont4 + cont5 + cont6;
		
		if(sum == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	public static String comparar(int[] arr)
	{
		boolean flag = false;
		String str= "";
		
		for(int i =0; i < arr.length; i++)
		{
			for(int j =0; j < arr.length; j++)
			{
				if(i != j)
				{
					flag = verifyVal( i, j, arr);
					if(flag == true)
					{
						str += "(" + i + "," + j + ")";
					}

				}
			}
		}
		
		if(str == "") return "Nothing"; else return str;
	}
	
	public static boolean verifyVal(int i, int j, int[] arr)
	{
		int sum =0;
		int rest =0;
		
		sum = arr[i] + arr[j];
		
		for(int x =0; x < arr.length; x++)
		{
			if(x != i && x != j)
			{
				rest = rest + arr[x];
			}
			
		}
		
		if(sum == rest)
		{
			return true;
		}
		else 
		{
			return false;
		}
			
	}
	
	public static class Tuple
	{
		String web;
		Integer usr;
		
		Tuple(String web, Integer usr)
		{
			this.web= web;
			this.usr=usr;
		}
	}
	public static void Permutaciones(String str)
	{
		List<Character> lst = new ArrayList<Character>();
		
		for(int i=0; i < str.length(); i++)
		{
			lst.add(str.charAt(i));
		}
		
		write("", lst);

	}
	public static void write(String a, List<Character> ls)
	{
		if(ls.size()==1) System.out.println(a+ls.get(0));
		
		for(int i=0; i < ls.size(); i++)
		{
			Character b = ls.remove(i);
			write(a+b,ls);
			ls.add(i,b);
		}
	}
	
	public static int BinarySearch(int[] arr, int key)
	{
		int pos =0, min =0, max = arr.length-1;
		
		
		while(min < max)
		{
			pos = (min+max)/2;
			
			if(key < arr[pos])
			{
				max = pos;
			}
			else if(key > arr[pos])
			{
				min = pos;
			}
			else
			{
				break;
			}
		}
	
		return pos;
	}
	
	public static String decoder(String str)
	{
		// "3[a]2[bc]", return "aaabcbc".
		
		Stack<String> sts = new Stack<String>();
		Stack<Integer> sti = new Stack<Integer>();
		
		Character c;

		String CommunStr = null;
		Integer communInt=0;
		int times =0;

		
		for(int i=0; i < str.length(); i++)
		{
			c = str.charAt(i);
			
			if(Character.isDigit(c))
			{
				
				communInt = communInt*10 + c - '0';

			}
			else if(c == '[')
			{
				sti.push(communInt);
				
				if(CommunStr == null) sts.push(""); else sts.push(CommunStr);
				
				communInt =0;
				CommunStr = "";
			}
			else if(c == ']')
			{
				times = sti.pop();
				StringBuffer sb = new StringBuffer();
				
				for(int j=0; j< times; j++)
				{
					sb.append(CommunStr);
				}
				
				times = 0;
				
				CommunStr = sts.pop();
				CommunStr += sb;
				
			}
			else
			{
				CommunStr += c;
			}
		}
		
		return CommunStr;
		
	}
	
	public static String reverse(String str)
	{
		if(str.length() == 1) return str;
		
		String sub = str.substring(1, str.length());
		
		return reverse(sub) + str.charAt(0);
	}
	
	public static String simil(List<Tuple> lst)
	{
		HashMap<String, HashSet<Integer>> map = new HashMap<String, HashSet<Integer>>();
		String key = "";
		
		
		for(int i = 0; i < lst.size(); i++)
		{
			HashSet<Integer> set = new HashSet<Integer>();
			key = lst.get(i).web;
			
			if(!map.containsKey(key))
			{
				set.add(lst.get(i).usr);
				map.put(key, set);
			}
			else
			{
				set = map.get(key);
				set.add(lst.get(i).usr);
				map.put(key, set);
			}
		}
		
		double comp = 0;
		double value = -100;
		String result = "";
		int cont = 1;
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry mapE1 = (Map.Entry)it.next();
			
			Iterator it2 = map.entrySet().iterator();
			
			Map.Entry mapE2 = null;
			
			for(int i=0; i<cont;i++)
			{
				mapE2 = (Map.Entry)it2.next();
			}
			
			while(it2.hasNext())
			{
				mapE2 = (Map.Entry)it2.next();
				
				comp = verify((Set)mapE1.getValue(), (Set)mapE2.getValue());
				
				if(value < comp)
				{
					value = comp;
					result = mapE1.getKey() + "<-->" + mapE2.getKey();
				}
			}
			
			cont++;
			
		}
		
		return result;
		
	}
	
	public static double verify(Set a, Set b)
	{
		double same=0;
		double dif =0;
		double val = 0;
		
		Iterator itm = a.iterator();
		
		while(itm.hasNext())
		{
			
			System.out.println(b.contains(itm.next()));
			
			
			if(b.contains(itm.next()))
			{
				same++;
				
			}
			else 
			{
				dif++;
			}
		}
		
		dif = dif + b.size() - same;
		
		if(dif == 0) 
		{
		return -1;
		}
	else
	{
		val = same/dif;
		return val;
	}
	}
	
	public static void main(String args[])
	{
		
		//System.out.println(brackets("[(a+b-(c/d))()%%%%%^^^^***]"));
		
		System.out.println(decoder("3[a]2[bc]"));
		
		
		
		
		/*

		int[] arr = {2, 11, 5, 1, 4, 7};
		boolean band = false;
		System.out.println(comparar(arr));
				
		 

		List<Tuple> lst = new ArrayList<Tuple>();
		
		lst.add(new Tuple("a",1));
		lst.add(new Tuple("a",2));
		lst.add(new Tuple("a",3));
		lst.add(new Tuple("d",1));
		lst.add(new Tuple("d",2));
		lst.add(new Tuple("d",3));
		lst.add(new Tuple("b",4));
		lst.add(new Tuple("b",5));
		lst.add(new Tuple("b",6));
		
		
		System.out.println(simil(lst));
		

		  
		 System.out.println(reverse("hola"));
		 
		 System.out.println(decoder("3[a]2[bc]")); 
		 
		Permutaciones("ABC");
		
		int[] arr = {1,2,3,4,5,6,9};
		int key = 5;
		
		System.out.println(BinarySearch(arr, key));
		*/
	}
	
	

}
