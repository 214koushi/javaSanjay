package InterviewPrograms;

import org.testng.annotations.Test;

public class P4 {

	
	@Test
	public void insertstringintoMidleofarray() {
		String str[]= {"string","array","int","byt","lon","floor","hare"};
		String str1[]=new String[(str.length)+1];
		String s="shore";
		for (int i = 0; i < str1.length; i++) {
			if(i==str1.length/2) {
				str1[i]=s;
			}
			else if(i<=str1.length/2) {
				str1[i]=str[i];
			}
			else if(i>str1.length/2) {
				str1[i]=str[i-1];
			}
		}
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]+", ");
		}
		System.out.println();
	}
}
