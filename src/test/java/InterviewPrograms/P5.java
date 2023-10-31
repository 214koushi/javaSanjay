package InterviewPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class P5 {

	@Test
	public void characterandcount() {
		String s="aaabbcccdd";
		int count=0;
		char[] ch = s.toCharArray();
		HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
		
		for (int i = 0; i < ch.length; i++) {
			hm.put(ch[i], hm.getOrDefault(ch[i], 0)+1);
			
		}
		for(Entry<Character, Integer> vc:hm.entrySet()) {
			System.out.print(vc.getKey()+""+vc.getValue());
		}
		System.out.println();
	}
}
