package String;

import java.util.HashMap;
import java.util.HashSet;

import org.testng.annotations.Test;

public class String12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]= {"abc","abc","dcd","sap"};
		String s1="";
		String s2="";
		HashMap<String,Integer>hs=new HashMap<String,Integer>();
		//char[] ch = s.toCharArray();
	for (int i = 0; i < s.length; i++) {
		 
			hs.put(s[i], hs.getOrDefault(s[i], 0)+1);
		
		
	}
		
		System.out.println(hs);
	}

@Test
public void Sring() {
	
	String s="preeethi";
	int c=0;
	char[] ch = s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		
	}
	System.out.println(c);
	
}
}
