package FindSum;

import java.util.Arrays;



public class Main {
	
	public static boolean sum(int[] array, int val)
	{
		int n = array.length-1;
		int i = 0;
		
		Arrays.parallelSort(array);
		
		while(i < n)
		{
			if((array[i] + array[n]) < val) i++;
			else if((array[i] + array[n]) > val) n--;
			else return true;
		}
		
		return false;
	}

	public static void main(String[] args)
	{
		int[] vec = {10, 20, 22, 77, 23};
		int key = 98;
		
		System.out.println(sum(vec, key));

	}

}
