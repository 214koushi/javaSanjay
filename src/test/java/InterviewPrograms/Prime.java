package InterviewPrograms;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Prime {
	@Test
	public   void primenos() {
		int n=100;
		 for (int i = 0; i < n; i++) {
			int count=0;
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count==0) {
				System.out.print(i+" ,");
			}
		}
		
	
	}
	@Test
	public void palindrome() {
		int rev=0;
		int num= 010;
		int temp=num;
		while (num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if (temp==rev) {
			System.out.println(temp+" is palindrome");
		}
	}
	@Test
	public void p1() {
		int num= 010100;

	StringBuffer s = new StringBuffer(String.valueOf(num));
	StringBuffer a = s.reverse();
	System.out.println(a);
	}
	}