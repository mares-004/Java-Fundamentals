package preparacion;

public class CountPairs
{
	public int count(int[] array)
	{
		int k = 0, num=0;
		
		k = array[0];
		
		for(int i=1; i< array.length;i++)
		{
			for(int j=1; j< array.length; j++)
			{
				if(i != j)
				{
					if((array[i])==array[j])
					{
						num+=1;
					}
				}
			}
		}
		
		return num;
	}

}
