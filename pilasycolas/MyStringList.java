package pilasycolas;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray; 
	private int size;
	private int length;
	public MyStringList()
	{
		strArray  = new String[INITIAL_LENGTH];
		size = 0;
		length = INITIAL_LENGTH;
	}	
	public void add(String s){
		if (size == length)
			resize();
		
		strArray[size] = s;
		size++;
	}	
	public String get(int i){
		if (i >= size)
			return "Invalid index";
		else
			return strArray[i];
	}	
	public boolean find(String s){
		for (int i = 0; i < size; i++) {
			if (s.equals(strArray[i]))
				return true;
		}
		return false;
	}	
	public void insert(String s, int pos)
	{
		if(pos < strArray.length)
		{
			if(pos > size)
			{
				strArray[pos] = s;
			}
			else
			{
				for(int i=size; i >= pos ; i--)
				{
					strArray[i+1] = strArray[i];
				}
				
				strArray[pos] = s;
			}
			
		}
		
	}
    public boolean remove(String s)
    {
    	boolean flag = false;
    	for(int i=0; i < size; i++)
    	{
    		if(s.equals(strArray[i])==true)
    		{
    			strArray[i] = null;
    			flag = true;
    		}
    	}
    	
    	return flag;
    }		
	private void resize()
	{
		 Arrays.copyOf(strArray, strArray.length + 10);
		 length = strArray.length;
	}
	public int size() {
		return size;
	}
	
	public static void main(String args[]) {
		
	}
}
