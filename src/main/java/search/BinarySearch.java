package search;

public class BinarySearch
{
    public int binarySearchRecursive(int[] arr, int low, int high, int val)
    {
	if (low <= high)
	{
	    int mid = low + (high - low) / 2;

	    // base case
	    if (arr[mid] == val) return mid;
	    if (arr[mid] < val)  return binarySearchRecursive(arr, mid + 1, high, val);
	    if (arr[mid] > val)  return binarySearchRecursive(arr, low, mid - 1, val);
	}
	return -1; // element not found
    }

    public int binarySearchIterative(int[] arr, int low, int high, int val)
    {
	int mid = 0;
	while (low <= high)
	{
	    mid = low + (high - low) / 2;
	    
	    if (arr[mid] == val) return mid;
	    if (arr[mid] < val) low = mid + 1;
	    if (arr[mid] > val) high = mid - 1;
	}
	return -1; // element not found
    }
}
