package String;

import java.util.LinkedHashSet;

public class Positionofeachcharinreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Super";
		String rev="";
	LinkedHashSet<Character>lhs=new LinkedHashSet<Character>();
	for (int i =s.length()-1; i >=0 ; i--) {
		lhs.add(s.charAt(i));
	}
	for(Character set:lhs) {
		for (int i = s.length()-1; i >=0; i--) {
			
			if (set.equals(s.charAt(i))) {
				System.out.println(set+"  "+(i+1));
				break;	
			}
		}
	}
	// with duplicates
	for (int i = s.length()-1; i >=0 ; i--) {
		System.out.println(s.charAt(i)+""+(i+1));
	}
	}

}
