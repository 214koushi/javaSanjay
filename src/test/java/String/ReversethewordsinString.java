package String;

import org.testng.annotations.Test;

public class ReversethewordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="I am from Testyantra";
        String[] s1 = s.split(" ");
        for (int i = 0; i <s1.length; i++) {
			String str=s1[i];
			for (int j = str.length()-1; j >=0; j--) {
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
		}
	}
	@Test
	public void Stringsq() {
		String s="my name is koushik";
		
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			String ab=a[i];
			for (int j =ab.length()-1 ; j >=0 ; j--) {
				char ch = ab.charAt(j);
				System.out.print(ch);
			}
			System.out.print(" ");
		}
		
	}
	
@Test
public void xcs() {
	String s="koushikk";
	String s1="";
	String s2=s;
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i)!='\0') {
			s1=s1+s.charAt(i);
			s=s.replace(s.charAt(i), '\0');
		}
	}
	System.out.println(s1);
	for (int i = 0; i < s1.length(); i++) {
		int count =0;
		for (int j = 0; j < s2.length(); j++) {
			if (s1.charAt(i)==s2.charAt(j)) {
				count++;
			}
		}
		System.out.println(s1.charAt(i)+"-->"+count);
	}
}
}
