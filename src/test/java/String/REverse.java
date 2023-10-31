package String;

import org.testng.annotations.Test;

public class REverse {
 public static void main(String[] args) {
	 //1st
	 String s="kushialwaysloveskkoushi";
	char[] ch = s.toCharArray();
	for (int i = ch.length-1; i >0; i--) {
		System.out.print(ch[i]);
	}
//----------------------------------------------------------------	
	//2nd
	String rev="";
	for (int i =ch.length-1; i >0; i--) {
		rev+=ch[i];
	}
	System.out.println();
	System.out.println(rev);
	//------------------------------------------------------------------
	StringBuffer sb=new StringBuffer("Koushi");
	sb.reverse();
	System.out.println(sb);
	//----------------------------------------------------------------
	StringBuilder sb1=new StringBuilder("Kushi");
	sb1.reverse();
	System.out.println(sb1);
	
	//-----------------------------------------------------------
	String s1="Bendakalur";
	char[] ch1 = s1.toCharArray();
	String rev1=" ";
	for(char str:ch1) {
	
	
	}
 }
}
