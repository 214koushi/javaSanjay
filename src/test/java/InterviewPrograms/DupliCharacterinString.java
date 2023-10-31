package InterviewPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class DupliCharacterinString {

	
	@Test
	public void CharacterinString() {
		String s="Malayalam";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		for (int i = 0; i < ch.length; i++) {
			int c=0;
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					c++;
				}
			}
			if (c>=1) {
				System.out.print("");
			}
			else {
				System.out.println(ch[i]+"--->"+c);
			}
		}
	}
	@Test
	public void DupCharsinSTringAscendingorder() {
	HashSet<Character>hs=new HashSet<Character>();
	String s="MalayalaM";
	char[] ch1 = s.toCharArray();
	Arrays.sort(ch1);
	for (int i = 0; i < ch1.length; i++) {
		hs.add(ch1[i]);
	}
	System.out.println(hs);
	}
}
