package sort;

public class MergeSort
{
    public void mergeSort(int[] arr, int l, int r)
    {
	// base case
	if (l < r)
	{
	    int m = l + (r - l) / 2; // find mid
	    mergeSort(arr, l, m); // sort left
	    mergeSort(arr, m + 1, r); // sort right
	    merge(arr, l, m, r); // merge left & right
	}
    }

    private void merge(int[] arr, int l, int m, int r)
    {
	// Find sub array sizes
	int a1 = m - l + 1;
	int a2 = r - m;

	// Create new sub arrays
	int[] left = new int[a1];
	int[] right = new int[a2];

	// Copy contents to sub arrays
	for (int i = 0; i < a1; i++)
	    left[i] = arr[l + i];
	// Copy contents to sub arrays
	for (int j = 0; j < a2; j++)
	    right[j] = arr[(m + 1) + j];

	// merge sub arrays
	int k = l, i = 0, j = 0;
	while (i < a1 && j < a2)
	{
	    if (left[i] <= right[j])
		arr[k++] = left[i++];
	    else
		arr[k++] = right[j++];
	}

	// Remaining elements in left array
	while (i < a1)
	    arr[k++] = left[i++];

	// Remaining elements in right array
	while (j < a2)
	    arr[k++] = right[j++];
    }
}
