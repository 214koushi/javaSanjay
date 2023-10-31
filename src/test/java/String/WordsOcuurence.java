package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class WordsOcuurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I am from am from Testyantra";
		String[] s1 = s.split(" ");
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for(String addwd:s1) {
			hs.add(addwd);
		}
		for(String addocc:hs) {
			int count=0;
			for(String addwd:s1) {
				
				if (addwd.equals(addocc)) {
					count++;
				}
			}
			System.out.println(addocc+"---->"+count);
		}
	}

}
