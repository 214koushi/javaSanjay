package InterviewPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// remove duplicates
		String s="koushikkarthik";
		HashSet<Character>hs=new HashSet<Character>();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]!=ch[j]) {
					hs.add(ch[i]);
				}
			}
			
		}
		System.out.println(hs);
		
		
	}

}
