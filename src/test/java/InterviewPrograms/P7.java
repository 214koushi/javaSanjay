package InterviewPrograms;

import java.util.HashSet;

import org.testng.annotations.Test;

public class P7 {

	@Test
	public void occurenceofword() {
		HashSet<String> hs=new HashSet<String>();
		String s="My name is rishav it contains ri and shav";
		String[] s2 = s.split(" ");
		for(String ab:s2) {
			hs.add(ab);
		}
		for(String ad:hs) {
			int count=0;
			for(String ab:s2) {
				if (ab==ad) {
					count++;
				}
			}
			System.out.println(ad+"---"+count);
		}
	}
	
}
