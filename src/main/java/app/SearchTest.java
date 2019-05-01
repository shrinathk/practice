package app;

import java.util.Arrays;

import search.BinarySearch;
import search.LinearSearch;

public class SearchTest
{
    public static void main(String[] args)
    {
	int[] arr = { 9, 5, 4, 7, 2, 1, 0, 8, 6, 3 };
	LinearSearch ls = new LinearSearch();
	int searchVal = 7;
	System.out.println("Original Array " + Arrays.toString(arr));

	System.out.println("[Linear Search] Element " + searchVal + " found at index " + ls.linearSearch(arr, searchVal));

	searchVal = 55;
	System.out.println("[Linear Search] Element " + searchVal + " found at index " + ls.linearSearch(arr, searchVal));
	
	System.out.println();
	
	int[] sortedArr = { 0, 10, 25, 31, 47, 53, 60, 78, 89, 94 };
	BinarySearch bs = new BinarySearch();
	System.out.println("Sorted Original Array " + Arrays.toString(sortedArr));
	
	searchVal = 47;
	System.out.println("[Binary Search Iterative] Element " + searchVal + " found at index " 
	+ bs.binarySearchIterative(sortedArr, 0, arr.length-1, searchVal));
	
	searchVal = 47;
	System.out.println("[Binary Search Recursive] Element " + searchVal + " found at index " 
	+ bs.binarySearchRecursive(sortedArr, 0, arr.length-1, searchVal));
	
	searchVal = 149;
	System.out.println("[Binary Search Iterative] Element " + searchVal + " found at index " 
	+ bs.binarySearchIterative(sortedArr, 0, arr.length-1, searchVal));
    }
}
