package InterviewPrograms;

import org.testng.annotations.Test;

public class P8 {

	@Test
	public void stringpgms() {
		//aa ab bc bb de ea aa
		String s="aabcbbdeaa";
		char[] ch = s.toCharArray();try {
			for (int i = 0; i <ch.length; i++) {
				
				System.out.print(ch[i]+""+ch[i+1]+" ,");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
