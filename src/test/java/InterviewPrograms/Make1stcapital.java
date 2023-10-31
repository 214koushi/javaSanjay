package InterviewPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Make1stcapital {

	
	@Test
	public void makecap() {
		String s="i ama bad boy";
		String[] str = s.split(" ");

		for(String word:str) {
			String w =" ";
		//	System.out.print(word.replace(word.charAt(0),  (char) (word.charAt(0)-32)));
		for(int i=0; i<word.length(); i++) {
			
			if(i == 0) {
			
				w=w+(char) (word.charAt(0)-32);
			}
			else {
				w= w+word.charAt(i);
			}
		}
		System.out.print(w+" ");	
		}
		System.out.println();
	}
	@Test
	public void makecap1stinarray() {
		
		String str[]= {"abc","fho","bef","nsk","jcn","sked"};
		TreeSet<String> s = new TreeSet<String>();

		for(String w1:str) {
			System.out.print(" "+w1.substring(0,1).toUpperCase()+w1.substring(1,w1.length()));
		
		}
		
		System.out.println(" ");	
		
	}

}
