package preparacion;

public class SongsPair
{
	public int isPair(int[] array)
	{
		int num=0;
		
		for(int i = 0; i < array.length; i++)
		{
			for(int j=0; j< array.length; j++)
			{
				if(i != j)
				{
					if(((array[i]+array[j])%60)== 0)
					{
						num+=1;
					}
				}
			}
		}
		
		return num/2;
	}

}
