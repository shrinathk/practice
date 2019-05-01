package problems.math;

public class MathProblems
{
    public static int factorialRecursive(int n)
    {
	if (n == 0 || n == 1)
	    return 1;
	else
	    return n * factorialRecursive(n - 1);
    }

    public static int factorialIterative(int n)
    {
	if (n == 0 || n == 1)
	    return 1;
	else
	{
	    int val = 1;
	    for (int i = n; i > 1; i--)
		val *= i;
	    return val;
	}
    }

    public static boolean isNumberPrime(int n)
    {
	if (n <= 0 || n == 1)
	    return false;

	boolean divisorFound = false;

	for (int i = 2; i <= n / 2; i++)
	{
	    if (n % i == 0)
	    {
		divisorFound = true;
		break;
	    }
	}
	if (divisorFound)
	    return false;
	else
	    return true;
    }

    public static int[] swapWithoutTemp(int[] input)
    {
	input[0] = input[0] + input[1];
	input[1] = input[0] - input[1];
	input[0] = input[0] - input[1];

	return input;
    }
}
