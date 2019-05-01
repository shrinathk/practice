package problems.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import problems.math.MathProblems;
import utils.NumberUtils;
import utils.StringUtils;

public class StringProblems
{
    public static String reverse(String s)
    {
	int n = s.length();
	StringBuilder revString = new StringBuilder();

	for (int i = n - 1; i >= 0; i--)
	{
	    revString.append(s.charAt(i));
	}
	return revString.toString();
    }

    public static boolean isPalindrome(String s)
    {
	int l = 0;
	int r = s.length() - 1;

	while (l <= r)
	    if (!(s.charAt(l++) == s.charAt(r--)))
		return false;

	return true;
    }

    public static boolean areAnagrams(String s1, String s2)
    {
	int n1 = s1.length();
	int n2 = s2.length();

	if (n1 != n2)
	    return false;

	Map<Character, Integer> m1 = new HashMap<Character, Integer>();
	Map<Character, Integer> m2 = new HashMap<Character, Integer>();

	for (int i = 0; i < n1; i++)
	{
	    if (m1.containsKey(s1.charAt(i)))
		m1.put(s1.charAt(i), m1.get(s1.charAt(i)) + 1);
	    else
		m1.put(s1.charAt(i), 1);

	    if (m2.containsKey(s2.charAt(i)))
		m2.put(s2.charAt(i), m2.get(s2.charAt(i)) + 1);
	    else
		m2.put(s2.charAt(i), 1);
	}

	return m1.equals(m2);
    }

    public static boolean areParenthesisBalanced(String s)
    {
	int n = s.length();

	if (n % 2 != 0)
	    return false;

	Stack<Character> st = new Stack<Character>();

	for (int i = 0; i < n; i++)
	{
	    Character c = s.charAt(i);

	    switch (c)
	    {
		case '{':
		case '[':
		case '(':
		    st.push(c);
		    break;

		case '}':
		    if ('{' != st.pop())
			return false;
		    else
			break;

		case ']':
		    if ('[' != st.pop())
			return false;
		    else
			break;

		case ')':
		    if ('(' != st.pop())
			return false;
		    else
			break;
	    }
	}
	
	if(st.isEmpty())
	    return true;
	else
	    return false;
    }
    
    public static void printAllPermutationsOfAString(String s)
    {
	int n = s.length();
	permute(s, 0, n-1);	
    }
    
    private static void permute(String s, int l, int r)
    {
	if(l == r)
	    System.out.println(s);
	else
	{
	    for (int i = l; i <= r; i++) 
            { 
                s = StringUtils.swapChars(s, l, r); 
                permute(s, l+1, r); 
                s = StringUtils.swapChars(s, l, i);
            }
	}
    }
}
