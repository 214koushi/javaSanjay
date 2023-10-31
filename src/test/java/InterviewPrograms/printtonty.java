package InterviewPrograms;

import org.testng.annotations.Test;

public class printtonty {

	int i=30;
	static public  void main(String[] args) {
		// TODO Auto-generated method stub

		int i=40;
		System.out.println(i);
	}

	@Test
	public void ooty() {
		String s="i am in ooty";
		String[] ch = s.split(" ");
		for (int i = 0; i < ch.length; i++) {
			 String ch1 = ch[i];
			 if (i!=0) {
				 for (int j =ch1.length()-1; j>=0; j--) {
						System.out.print(ch1.charAt(j));
					}
					System.out.print(" ");
				
			}
			}
	}
	
	@Test
	public void count() {
		int count=0;
		 char[] s = "IMMUNUTIES".toLowerCase().toCharArray();
		for (int i = 0; i < s.length; i++) {
			if (s[i]=='u') {
				 count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void pattern() {
		/*
A
A B 
A B C 
A B C D 
A B C D E 
		 */
		for (int i = 0; i <5; i++) {
			char ch='A';
			for (int j = i; j <5; j++) {
				
					System.out.print(" ");
				
			}
			for (int j = 0; j <=i; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
		
	}
}
