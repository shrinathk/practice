package sort;

import utils.NumberUtils;

public class BubbleSort
{
    public void bubbleSort(int[] arr)
    {
	int n = arr.length;
	boolean swapped = false;

	// Last element will be sorted, hence n-1
	for (int i = 0; i < n - 1; i++)
	{
	    // Last i elements are already sorted, hence n-1-i
	    for (int j = 0; j < n - 1 - i; j++)
	    {
		if (arr[j] > arr[j + 1])
		{
		    NumberUtils.swapInts(arr, j, j + 1);
		    swapped = true;
		}
	    }
	    // If no swaps happened, then array is sorted.
	    if (swapped == false)
	    {
		break;
	    }
	}
    }
}
