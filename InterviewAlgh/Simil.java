package InterviewAlgh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Simil
{
	public static class Tuple
	{
		String web;
		int usr;
		
		public Tuple(String web, int usr)
		{
			this.web = web;
			this.usr = usr;
		}
	}
	
	public static String Similarity(List<Tuple> lst)
	{
		HashMap<String, HashSet<Integer>> common = new HashMap<String, HashSet<Integer>>();
		String key = "";
		
		for(int i= 0; i < lst.size(); i++)
		{
			HashSet<Integer> set = new HashSet<Integer>();
			key = lst.get(i).web;
			
			if(!common.containsKey(key))
			{
				set.add(lst.get(i).usr);
				common.put(key, set);
			}
			else
			{
				set = common.get(key);
				set.add(lst.get(i).usr);
			}
			
		}
		
		double comp = 0;
		double value = -100;
		String result = "";
		int cont = 1;
		
		Iterator it1 = common.entrySet().iterator();
		while(it1.hasNext())
		{
			Map.Entry mapE1 = (Map.Entry) it1.next();
			
			Iterator it2 = common.entrySet().iterator();
			Map.Entry mapE2 = null;
			
			for(int j = 0; j < cont; j++)
			{
				mapE2 = (Map.Entry) it2.next();
			}
			
			while(it2.hasNext())
			{
				mapE2 = (Map.Entry) it2.next();
				
				comp = Verify((Set) mapE1.getValue(), (Set) mapE2.getValue());
				
				if(value < comp)
				{
					value = comp;
					result = "Result: Key1" + mapE1.getKey() + "- Key2" +  mapE2.getKey();
				}
				
			}
			
			cont++;
			
		}
		
		return result;
	}
	
	public static double Verify(Set a, Set b)
	{
		Iterator itm = a.iterator();
		int sam=0;
		int dif =0;
		
		while(itm.hasNext())
		{
			if(b.contains(itm.next()))
			{
				sam++;
			}
			else
			{
				dif++;
			}
		}
		
		dif = dif + b.size() - sam;
		
		if(dif == 0) return 100; else return sam/dif;
	
	}
	
	public static void main(String args[])
	{
		List<Tuple> list = new ArrayList<Tuple>();
		
		list.add(new Tuple("a", 2));
		list.add(new Tuple("a", 3));
		list.add(new Tuple("a", 4));
		list.add(new Tuple("b", 2));
		list.add(new Tuple("b", 3));
		list.add(new Tuple("b", 5));
		list.add(new Tuple("c", 2));
		list.add(new Tuple("c", 3));
		list.add(new Tuple("c", 4));
		
		System.out.println(Similarity(list));
	}

}
