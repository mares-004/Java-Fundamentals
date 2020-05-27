package preparacion;

public class Palindroma
{
	public boolean isPalindroma(String s)
	{
		int i = 0, n = s.length()-1;
		boolean flag = true;
		
		while(i <= s.length()-1)
		{
			if(s.charAt(i) == s.charAt(n))
			{
				i += 1;
				n -= 1;
			}
			else
			{
				flag = false;
				i = s.length();
			}
		}

	return flag;
	
	}
	
	public int StringPalindroma(String str)
	{
		int num = 0;
		int k = 0, l = 0;
		StringBuilder word = new StringBuilder();
		
		while(k < str.length())
		{
			l = k;
			word.setLength(0);
			
			while (l < str.length())
			{
			
				word.append(str.charAt(l));
				
				if(isPalindroma(word.toString()) == true)
				{
					num++;
				}
			
				l++;
			}
			
			k++;
		}
		
		return num;
	}
	
}
