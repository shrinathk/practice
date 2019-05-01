package search;

public class LinearSearch
{
    public int linearSearch(int[] arr, int val)
    {
	int n = arr.length;
	for (int i = 0; i < n; i++)
	{
	    if (arr[i] == val)
		return i;
	}
	return -1; // element not found
    }
}
