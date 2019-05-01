package problems.arrays;

import java.util.Arrays;

import utils.NumberUtils;

public class ArrayProblems
{
    public static void printArray(int[] arr)
    {
	for(int i = 0; i < arr.length; i++)
	    System.out.print(arr[i] + " ");
	
	System.out.println();
    }
    
    public static void printArrayRecursively(int[] arr, int pos)
    {
	if(pos <= arr.length - 1)
	{
	    System.out.print(arr[pos] + " ");
	    printArrayRecursively(arr, pos+1);
	}
	else
	{
	    System.out.println();
	    return;
	}
    }
    
    public static void printArrayReverse(int[] arr)
    {
	for(int i = arr.length-1; i >= 0; i--)
	    System.out.print(arr[i] + " ");
	
	System.out.println();
    }
    
    public static void printArrayReverseRecursively(int[] arr, int pos)
    {
	if(pos > arr.length - 1)
	    return;
	else
	{
	    printArrayReverseRecursively(arr, pos+1);
	    System.out.print(arr[pos] + " ");
	    
	    if(pos == 0)
		System.out.println();
	}
    }
    
    public static void printEquilibriumIndexesOfArray(int[] arr)
    {
	int totalSum = Arrays.stream(arr).sum();
	int n = arr.length;
	int leftSum = 0; 
	int rightSum = totalSum;
	
	for(int i = 0; i < n; i++)
	{
	    rightSum -= arr[i];
	    
	    if(leftSum == rightSum)
		System.out.println("Equilibrium Index found at " + i);
	    
	    leftSum += arr[i];
	}
    }
    
    public static void printSubArrayWithGivenSum(int[] arr, int sum)
    {
	int currSum = arr[0];
	int n = arr.length;
	int start = 0, end = 0;
	
	for(int i = 1; i < n; i++) // ??? < n or <=n
	{
	    while(currSum > sum && start < i-1)
		currSum -= arr[start++];
	    
	    if(currSum == sum)
	    {
		end = i-1;
		System.out.println("Sub Array with sum = " + sum 
			+ " found between indexes " + start + " and " + end);
	    }	    
	    currSum += arr[i]; // ??? < n required ?
	}	
    }
    
    public static void printSubArrayWithMaxSum(int[] arr)
    {
	int n = arr.length;
	int currSum = 0;
	int maxSum = Integer.MIN_VALUE;
	int start = 0, end = 0;
	
	for(int i = 0; i < n; i++)
	{
	    currSum += arr[i];
	    
	    if(currSum < 0) // ??? Seq of ifs correct ?
	    {
		currSum = 0;
		start = i+1;
	    }
	    
	    if(maxSum < currSum)
	    {
		maxSum = currSum;
		end = i;
	    }
	}
	
	System.out.println("Max Sum is " + maxSum + " of element between indices " + start + " and " + end);
    }
    
    public static void sort012(int[] arr)
    {
	int low = 0, mid = 0, high = arr.length - 1;

	while (mid <= high)
	{
	    int val = arr[mid];

	    switch (val)
	    {
		case 0:
		    NumberUtils.swapInts(arr, low++, mid++); break;
		case 1:
		    mid++; break;
		case 2:
		    NumberUtils.swapInts(arr, mid, high--); break;
	    }
	}
    }
    
    public static void printLeadersInAnArray(int[] arr)
    {
	int n = arr.length - 1;
	System.out.print(arr[n] + " ");
	
	int currMax = Integer.MIN_VALUE;
	
	// {16, 17, 4, 3, 5, 2};
	for(int i = n-1; i >= 0; i--)
	{
	    if(currMax < arr[i])
	    {
		currMax = arr[i];
		System.out.print(currMax + " ");
	    }
	}
    }
    
    public static void leftRotateArrayByK(int[] arr, int k)
    {
	int n = arr.length;
	int i = 0, j= 0;
	
	// rotate by 1, k times
	for(i = 0; i < k; i++)
	{
	    int temp = arr[0];
	    
	    // rotating once
	    for(j = 0; j < n-1; j++)
		arr[j] = arr[j+1];
	    
	    arr[j] = temp;
	}
    }
    
    public static void printEleAllLeftSmallAllRightBig(int[] arr)
    {
	// Print all elements in the array where all elements to the
	// left of it are smaller than it and right of it are greater.
	
	// {5, 1, 4, 3, 6, 8, 10, 7, 9};
	
	int n = arr.length;
	int[] leftMax = new int[n];
	int[] rightMin = new int[n];
	int currentMax = arr[0];
	int currentMin = arr[n-1];
	
	for(int i = 1; i < n; i++)
	{
	    if(currentMax < arr[i])
	    {
		leftMax[i] = arr[i];
		currentMax = arr[i];
	    }		
	}
	
	for(int i = n-2; i >= 0; i--)
	{
	    if(currentMin > arr[i])
	    {
		rightMin[i] = arr[i];
		currentMin = arr[i];
	    }		
	}
	
	for(int i = 0; i < n; i++)
	    if(leftMax[i] == arr[i] && rightMin[i] == arr[i])
		System.out.println("Required Index is " + i);
    }
}
