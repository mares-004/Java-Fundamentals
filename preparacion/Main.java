package preparacion;

public class Main {

	public static void main(String[] args)
	{
		/*
		Palindroma obj = new Palindroma();
		
		System.out.println(obj.StringPalindroma("abccba"));
		
		
		String strc = "hola";
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < strc.length(); i++)
		{
			sb.append(strc.charAt(i));
		}
		
		System.out.println(sb);
		 
		
		int[] vec = {5,30,20,150,100,40};
		
		SongsPair obj = new SongsPair();
		
		System.out.println(obj.isPair(vec));
		
		
		ShapeFactory obj = new ShapeFactory();
		obj.drawShape("Circle");
		
		
		CountPairs obj = new CountPairs();
		
		int[] vec = {6,1,1,2,2,3,3,1};
		
		System.out.println(obj.count(vec));
		*/
		
		SubPalindroma obj = new SubPalindroma();
		System.out.println(obj.longestPalindrome("baabaab"));
		
	}

}
