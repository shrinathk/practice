package utils;

public class NumberUtils
{
    public static void swapInts(int[] arr, int i, int j)
    {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
    }
    
    public static int getDigits(int n)
    {
	int digitCount = 1;
	
	while(n > 9)
	{
	    n = n/10;
	    digitCount++;
	}
	
	return digitCount;
    }
}
