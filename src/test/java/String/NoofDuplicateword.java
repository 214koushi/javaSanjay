package String;

import java.util.LinkedHashSet;

public class NoofDuplicateword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I am from am from Testyantra";
		String[] s1 = s.split(" ");  
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			hs.add(s1[i]);
		}
		for(String str:hs) {
			int count=0;
			for (int i = 0; i < s1.length; i++) {
				if (s1[i].equals(str)) {
					count++;
				}
			}
			System.out.println(hs);
		}
		
		
		//without using collection
		
		
		
	}

}
