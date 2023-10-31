package String;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class countnoofVowelswithoutDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="IndianPolice";
		char[] ch = s.toCharArray();
		LinkedHashSet<Character>lhs=new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			lhs.add(ch[i]);
		}
		System.out.println(lhs);
		int count=0;
		for(Character s1:lhs) {
			if (s1=='A'||s1=='E'||s1=='I'||s1=='O'||s1=='U'||s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u') {
				count++;
			}
		}
		System.out.println(count);
		
		
		//2nd method
		LinkedHashMap<Character, Object>map=new LinkedHashMap<Character, Object>();
		for (int i = 0; i < ch.length; i++) {
			map.put(ch[i], i);
		}
		System.out.println(map);
		int count1=0;
		for(Entry<Character, Object> hey:map.entrySet()) {
			
			if (hey.getKey()=='A'||hey.getKey()=='O'||hey.getKey()=='I'||hey.getKey()=='E'||hey.getKey()=='U'||hey.getKey()=='a'||hey.getKey()=='e'||hey.getKey()=='i'||hey.getKey()=='o'||hey.getKey()=='u') {
				count1++;
			}
		}
		System.out.println(count1);
	}
	
}
