package reversestring;

public class Recursion
{
	private static String recursion(String str){
		//bc
		    if(str.length() == 1){
		        return str;
		    }
		    String sub = str.substring(1, str.length());
		 //c
		    
		    //c + b
		    return recursion(sub) + str.charAt(0);
		}
	
	public static void main(String[] args)
	{
		String s = "";
		System.out.println(recursion("Mares"));
	}


}
