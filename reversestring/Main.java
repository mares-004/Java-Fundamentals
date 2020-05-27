package reversestring;



public class Main {
	
	public static String reverse(String s)
	{
		String[] array = s.split(" ");
		int i = array.length-1;
		String str = "";
		
		while(i >= 0)
		{
			str = str + array[i] + " ";
			i--;
		}
		
		
		return str;
	}

	public static void main(String[] args) 
	{
		System.out.println(reverse("Clarin Mucho amo te "));

	}

}
