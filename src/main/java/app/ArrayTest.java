package app;

import java.util.Arrays;

import problems.arrays.ArrayProblems;

public class ArrayTest
{

    public static void main(String[] args)
    {
	printEleAllLeftSmallAllRightBig();
    }
    
    public static void printEleAllLeftSmallAllRightBig()
    {
	int[] arr = {5, 1, 4, 3, 6, 8, 10, 7, 9};
	ArrayProblems.printEleAllLeftSmallAllRightBig(arr);
    }
    
    public static void leftRotateArray()
    {
	int[] arr =  {16, 17, 4, 3, 5, 2};
	System.out.println(Arrays.toString(arr));
	ArrayProblems.leftRotateArrayByK(arr, 3);
	System.out.println(Arrays.toString(arr));
    }
    
    public static void arrayLeaders()
    {
	int[] arr =  {16, 17, 4, 3, 5, 2};
	ArrayProblems.printLeadersInAnArray(arr);
    }

    public static void dutchFlag()
    {
	// Six 0s, Six 1s, Eight 2s
	int[] arr = { 2, 1, 1, 2, 1, 0, 1, 0, 0, 0, 1, 2, 1, 2, 2, 0, 2, 0, 2, 2 };
	ArrayProblems.sort012(arr);
	System.out.println(Arrays.toString(arr));
    }
    
    public static void kadanes()
    {
	int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
	ArrayProblems.printSubArrayWithMaxSum(arr);
	
	int arr2[] = {-2, -3, 4,-1, -2, 1, 5, -3};
	ArrayProblems.printSubArrayWithMaxSum(arr2);
    }
    
    public static void sumSubArray()
    {
	int[] arr2 = { 15, 2, 4, 8, 9, 5, 10, 127 };
	int sum2 = 14;
	// Should pring 1,3
	ArrayProblems.printSubArrayWithGivenSum(arr2, sum2);
	System.out.println();
	
	int[] arr3 = { 1, 4, 20, 3, 10, 5 };
	int sum3 = 33;	
	// Should print 2,4
	ArrayProblems.printSubArrayWithGivenSum(arr3, sum3);
	System.out.println();
	
	int[] arr4 = {3,4,-7,1,3,3,1,4};
	int sum4 = 7;
	ArrayProblems.printSubArrayWithGivenSum(arr4, sum4);
    }

    public static void basicArrayTraversals()
    {
	// Basic Array traversals
	int[] arr = { 5, 1, 0, 4, 7, 2, 9, 3, 4, 6 };
	ArrayProblems.printArray(arr);
	ArrayProblems.printArrayRecursively(arr, 0);
	ArrayProblems.printArrayReverse(arr);
	ArrayProblems.printArrayReverseRecursively(arr, 0);
	System.out.println();
    }

    public static void equilibrium()
    {
	// Output is 3,6
	int[] equilibriumArr = { -7, 1, 5, 2, -4, 3, 0 };
	ArrayProblems.printEquilibriumIndexesOfArray(equilibriumArr);
	System.out.println();

	// Output is 0,3,7
	int[] equilibriumArr2 = { 0, -3, 5, -4, -2, 3, 1, 0 };
	ArrayProblems.printEquilibriumIndexesOfArray(equilibriumArr2);
    }

}
