package problems.hash;

import java.util.HashMap;
import java.util.Map;

public class WordDictionary
{
    public boolean doWordsExist(String[] dictionary, String[] letter)
    {
	// program to check if a letter can be written from words
	// given in a dictionary.
	int c1 = letter.length;
	int c2 = dictionary.length;

	if (c1 < 1 || c2 < 1 || c2 < c1)
	    return false;

	Map<String, Integer> dictionaryMap = new HashMap<String, Integer>();

	for (int i = 0; i < c2; i++)
	{
	    if (dictionaryMap.containsKey(dictionary[i]))
	    {
		Integer count = dictionaryMap.get(dictionary[i]);
		dictionaryMap.put(dictionary[i], (count + 1));
	    }
	    else
		dictionaryMap.put(dictionary[i], 1);
	}

	for (int i = 0; i < c1; i++)
	{
	    if (dictionaryMap.containsKey(letter[i]))
	    {
		Integer count = dictionaryMap.get(letter[i]);
		if (count > 1)
		    dictionaryMap.put(letter[i], (count - 1));
		else
		    dictionaryMap.remove(letter[i]);
	    }
	    else
		return false;
	}
	return true;
    }
}
