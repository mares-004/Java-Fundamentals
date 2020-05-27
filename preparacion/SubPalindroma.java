package preparacion;


import java.util.TreeMap;


public class SubPalindroma
{

public String longestPalindrome(String s)
{
    String saux;
    TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
    
    for(int i=0; i < s.length(); i++)
    {
        saux = Character.toString(s.charAt(i));
        
        for(int j=i+1; j < s.length(); j++)
        {
            saux = saux + Character.toString(s.charAt(j));
            
            if(isPal(saux))
            {
                tree.put(saux.length(), saux);
            }
        }
    }
    
    if(tree.lastEntry().getValue() != null)
    {
    	return tree.lastEntry().getValue();
    }
    else
    {
    	return " ";
    }
    
    
    
}

private boolean isPal(String saux) 
{
	int len = saux.length()-1;
	boolean band = true;
	
	for(int l = 0; l < saux.length(); l++)
	{
		if(saux.charAt(l) != saux.charAt(len))
		{
			band = false;
			break;
		}
		else
		{
			len--;
		}
			
	}
	
	return band;
}

}
