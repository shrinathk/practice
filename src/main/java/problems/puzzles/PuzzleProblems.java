package problems.puzzles;

public class PuzzleProblems
{
    public static void printTowerOfHanoiSolution(int n, char from, char to, char aux)
    {
	if (n == 1)
	{
	    System.out.println("Move disk from Peg " + from + " to " + to);	    
	    return;
	}

	printTowerOfHanoiSolution(n - 1, from, aux, to);
	System.out.println("Move disk from Peg " + from + " to " + to);
	printTowerOfHanoiSolution(n - 1, aux, to, from);
    }
}
