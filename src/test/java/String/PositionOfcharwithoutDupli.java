package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PositionOfcharwithoutDupli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hashset";
HashSet<Character>lhs=new HashSet<Character>();
for (int i = 0; i < s.length(); i++) {
	lhs.add(s.charAt(i));
}
for(Character ch:lhs) {
	for (int i = 0; i < s.length(); i++) {
		if (ch==s.charAt(i)) {
			System.out.println(ch+"  "+(i+1));
			break;
		}
	}
}
	}

}
