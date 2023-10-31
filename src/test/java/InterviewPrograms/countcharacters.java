package InterviewPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class countcharacters {

	@Test
	public void countCharacters() {
		
		String s="aweexxxyyyyyy";
		char[] ch = s.toCharArray();
		int c=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='a'&&ch[i]<='z') {
				c++;
			}
		}
		System.out.println(c);
	}
	
	
	@Test
	public void occurence() {
		String s="Malayalam";
		LinkedHashMap<Character, Integer>hm=new LinkedHashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			hm.put(ch[i], hm.getOrDefault(ch[i], 0)+1);
		}
		System.out.println(hm);
		for(Entry<Character, Integer> ab:hm.entrySet()) {
			System.out.println(ab.getKey()+""+ab.getValue());
		}
			
		
	}
	@Test
	public void abcd() {
		String s="Malayalam";
		char[] ch = s.toCharArray();
		int j=0;
		for (int i = 0; i < ch.length; i=j) {
			int count=1;
			for (j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
				}
				else {
					
				break;
				}
			}
			System.out.println(ch[i]+""+count);
		}
		
	}
}
