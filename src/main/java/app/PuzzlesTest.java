package app;

import problems.puzzles.PuzzleProblems;

public class PuzzlesTest
{
    public static void main(String[] args)
    {
	System.out.println("No. of Disks - 2");
	System.out.println("================");
	System.out.println();
	PuzzleProblems.printTowerOfHanoiSolution(2, 'A', 'C', 'B');
	System.out.println();
	
	System.out.println("No. of Disks - 3");
	System.out.println("================");
	System.out.println();
	PuzzleProblems.printTowerOfHanoiSolution(3, 'A', 'C', 'B');
    }
}
