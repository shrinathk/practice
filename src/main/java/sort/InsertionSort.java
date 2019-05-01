package sort;

public class InsertionSort
{
    public void insertionSort(int[] arr)
    {
	int n = arr.length;

	// First element is already sorted
	for (int i = 1; i < n; i++)
	{
	    int x = arr[i];
	    int j = i - 1;

	    // This loop shifts elements to the right to clear a spot for x.
	    while (j >= 0 && arr[j] > x)
	    {
		arr[j + 1] = arr[j];
		j--;
	    }

	    // after finding correct spot
	    arr[j + 1] = x;
	}
    }
}
