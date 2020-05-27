package structures;

public class BinarySearch 
{
	public int search(int[] arr, int key)
	{
		int iMax = arr.length -1;
		int iMin=0, pos=0, aux = 0;
		
		while(iMin < iMax)
		{
			aux = (iMin + iMax)/2;
			
			if(key < arr[aux])
			{
				iMax = aux;
			}
			else if (key > arr[aux])
			{
				iMin = aux;
			}
			else
			{
				pos= aux;
				break;
			}
		}
		
		return pos;
	}
	
}
