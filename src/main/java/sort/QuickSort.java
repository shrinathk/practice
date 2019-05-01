package sort;

import utils.NumberUtils;

public class QuickSort
{
    public void quickSort(int[] arr, int l, int r)
    {
	// base case
	if (l < r)
	{
	    int pi = partition(arr, l, r);
	    quickSort(arr, l, pi - 1);
	    quickSort(arr, pi + 1, r);
	}
    }

    private int partition(int[] arr, int l, int r)
    {
	int pivot = arr[r];
	int i = l - 1; // index of lower element

	for (int j = l; j < r; j++)
	{
	    if (arr[j] < pivot)
	    {
		i++;
		NumberUtils.swapInts(arr, i, j);
	    }
	}

	// finally swap pivot with partition index
	NumberUtils.swapInts(arr, i + 1, r);
	return (i + 1);
    }
}
