package sort;

import utils.NumberUtils;

public class SelectionSort
{
    public void selectionSort(int[] arr)
    {
	int n = arr.length;
	// last element is sorted in outer loop
	for (int i = 0; i < n - 1; i++)
	{
	    int minIdx = i;
	    for (int j = i + 1; j < n; j++)
	    {
		if (arr[j] < arr[minIdx])
		{
		    minIdx = j;
		}
	    }
	    NumberUtils.swapInts(arr, i, minIdx);
	}
    }
}
