package InterviewPrograms;

import org.testng.annotations.Test;

public class P6 {
	@Test
	public void reverseString() {
		String s="i   love selenium from bangalore";
		char[] ch1 = s.toCharArray();
		char[] ch2 = new char[ch1.length];
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i]== ' ') {
				ch2[i]=' ';
			}
		}
		int j=ch1.length-1;
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i]!=' ') {
				if (ch2[j]==' ') {
					j--;
				}
				ch2[j]=ch1[i];
				j--;
			}
		}
		System.out.println(ch2);
		
		}}

