package app;

import problems.hash.WordDictionary;

public class HashTest
{

    public static void main(String[] args)
    {
	WordDictionary wd = new WordDictionary();
	
	String[] d = {"give", "me", "one", "grand", "today", "night"};
	String[] l = {"give", "one", "grand", "today"};
	
	System.out.println("Can letter be written ? - " 
		+ wd.doWordsExist(d, l));
	
	String[] d1 = {"give", "me", "one", "today", "night"};
	String[] l1 = {"give", "one", "grand", "today"};
	
	System.out.println("Can letter be written ? - " 
		+ wd.doWordsExist(d1, l1));

    }

}
