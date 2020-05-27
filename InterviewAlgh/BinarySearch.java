package InterviewAlgh;

public class BinarySearch 
{
	public static int Search(int[] vec, int val)
	{
		int iMax = vec.length -1;
		int iMin = 0;
		int aux = 0;
		int pos = 0;
		
		
		while(iMin <= iMax)
		{
			pos = (iMax + iMin)/2;
		
			if(val < vec[pos])
			{
				iMax = pos;
			}
			else if(val > vec[pos])
			{
				iMin = pos;
			}
			else
			{
				pos = pos;
				break;
			}
		}
		
		return pos;
	}
	
	public static void main(String args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		
		System.out.println(Search(arr,3));
		
	}

}
