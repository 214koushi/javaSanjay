package String;

import java.util.HashSet;

public class CharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s="Testyantra";
		char[] ch = s.toCharArray();
		HashSet<Character> hs=new HashSet<Character>();
		for(char addwd:ch) {
			hs.add(addwd);	
		}
		for( Character addocc:hs) {
			int count =0;
			for(char addwd:ch) {
				if (addwd==addocc) {
					count++;
				}
			}
			System.out.println(addocc+">>>"+count);
		}
	}

}
