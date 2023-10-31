package InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class StringpalindromeByIterator {

	
	@Test
	public void iteratorPalindrome() {
		
		
		
		String s="malayalam";
		char[] ch = s.toCharArray();
	 List<char[]> ls1 = Arrays.asList(ch);
		System.out.println(ls1);
		Iterator<char[]> ab = ls1.iterator();
	}
}
