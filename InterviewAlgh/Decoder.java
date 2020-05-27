package InterviewAlgh;

import java.util.Stack;

public class Decoder
{
	public static String decoder(String s)
	{
		Character c;
		int iNumber=0; 
		String strC = null;
		Stack stkStr = new Stack();
		Stack stInt = new Stack();
		
		for(int i = 0; i < s.length(); i++)
		{
			c = s.charAt(i);
			
			if(Character.isDigit(c))
			{
				iNumber = (iNumber * 10) + c - '0';
			}
			else if(c == '[')
			{
				stInt.push(iNumber);
				if(strC != null) stkStr.push(strC); else stkStr.push("");
				
				
				iNumber = 0;
				strC = "";
				
				
			}
			else if(c == ']')
			{
				int Times = (int)stInt.pop();
				StringBuffer sb = new StringBuffer();
				
				for(int j=0;j < Times; j++)
				{
					sb.append(strC);
				}
				
				strC = (String)stkStr.pop();
				strC += sb;
			}
			else
			{
				strC += c;
			}
		}
	
		return strC;
	}
	
	public static void main(String args[])
	{
		System.out.println(decoder("3[a2[c]]"));
	}

}
