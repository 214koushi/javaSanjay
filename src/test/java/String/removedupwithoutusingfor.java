package String;

import java.util.HashSet;

import org.testng.annotations.Test;

public class removedupwithoutusingfor {

	
	@Test
	public void forloop() {
		String s="kjulujkmhytrrtyh";
		String s1 = "";
		String s2 = "";
		char[] ch = s.toCharArray();
		int c =0;
			for (int i = 0; i < ch.length; i++) {
				
				if(s.charAt(c)!=ch[i]) {
					s1=s1+ch[i];
					
					c++;
				}
				
		System.out.println(s1);
	}
}}