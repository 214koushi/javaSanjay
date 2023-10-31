package InterviewPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class P3 {

	
	@Test
	public void removeduplicatewords() {
		String s="I am from from am Banglore";
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		String[] str = s.split(" ");
		
		LinkedHashSet<String>hs=new LinkedHashSet<String>();
		String s1="";
		int c=0;
		for (int i = 0; i < str.length; i++) {
			hs.add(str[i]);
		}
		
		System.out.println(hs);
		for(String ab:hs) {
			for (int i = 0; i < str.length; i++) {
				if (ab==str[i]) {
				
					s1=s1+ab+" ";
				}
			}
			
		}
	
		System.out.print(s1);
		
	}
}
