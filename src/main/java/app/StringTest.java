package app;

import problems.strings.StringProblems;

public class StringTest
{

    public static void main(String[] args)
    {
	String toReverse = "Hello";
	System.out.println(toReverse + " reversed is " + StringProblems.reverse(toReverse));
	System.out.println();
	
	String isPal = "malayalam";
	System.out.println("Is " + isPal + " palindrome ? - " + StringProblems.isPalindrome(isPal));
	System.out.println();
	
	String ana1 = "silent";
	String ana2 = "listen";
	String ana3 = "hello";
	String ana4 = "bello";
	String ana5 = "top";
	String ana6 = "to";
	
	System.out.println("Are " + ana1 + " and " + ana2 + " anagrams ? - " + StringProblems.areAnagrams(ana1, ana2));
	System.out.println("Are " + ana3 + " and " + ana4 + " anagrams ? - " + StringProblems.areAnagrams(ana3, ana4));
	System.out.println("Are " + ana5 + " and " + ana6 + " anagrams ? - " + StringProblems.areAnagrams(ana5, ana6));
	System.out.println();
		
	String para1 = "[()]{}{[()()]()}";
	String para2 = "[(])";
	System.out.println("Are parenthesis balanced in " + para1 + " ? - " + StringProblems.areParenthesisBalanced(para1));
	System.out.println("Are parenthesis balanced in " + para2 + " ? - " + StringProblems.areParenthesisBalanced(para2));
	
	StringProblems.printAllPermutationsOfAString("ABC");
	
    }

}
