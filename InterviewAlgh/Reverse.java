package InterviewAlgh;

public class Reverse
{
	public static String recursion(String str)
	{
		if(str.length() == 1)
		{
			return str;
		}
		
		String aux = str.substring(1, str.length());
		
		return  recursion(aux) + str.charAt(0);
	}
	
	public static void main(String args[])
	{
		System.out.println(recursion("hola"));
	}

}
