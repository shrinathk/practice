package app;

import java.util.Arrays;

import problems.math.MathProblems;

public class MathTest
{
    public static void main(String[] args)
    {
	testMath();
    }
    
    public static void testMath()
    {
	int n = 4;
	
	System.out.println("Iterative " + n + "! = " + MathProblems.factorialIterative(n));
	System.out.println("Recursive " + n + "! = " + MathProblems.factorialRecursive(n));
	System.out.println();
	
	n = 7;
	System.out.println("Is " + n + " prime ? - " + MathProblems.isNumberPrime(n));
	n = 9;
	System.out.println("Is " + n + " prime ? - " + MathProblems.isNumberPrime(n));
	System.out.println();
	
	int[] arr = {2,5};
	System.out.println("Array - " + Arrays.toString(arr));
	MathProblems.swapWithoutTemp(arr);
	System.out.println("Array Swapped without temp - " + Arrays.toString(arr));
    }
}
