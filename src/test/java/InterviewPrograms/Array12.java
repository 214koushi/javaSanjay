package InterviewPrograms;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Array12 {

	@Test
	public void arry() {
		int[] a= {1,2,3,4,5};
		boolean flag =true;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if ((a[i]+a[j])==5) {
					flag=true;
					System.out.println(a[i]+" + "+a[j]+"=5"+" -->"+flag);
				}
				else {
					flag =false;
					System.out.println(a[i]+" + "+a[j]+" =5 "+" -->"+flag);
				}
			}
		}
	}
	
	@Test
	public void usdt() {
		int n=92,a=0,b=0;
		ArrayList<Object>ls=new ArrayList<>();
//		ls.add("0");
		ls.add("I");
		ls.add("II");
		ls.add("III");
		ls.add("IV");
		ls.add("V");
		ls.add("VI");
		ls.add("VII");
		ls.add("VIII");
		ls.add("IX");
		ls.add("X");
		ls.add("L");
		ls.add("C");
		int count = ls.size();
//		for (int i = 1; i < count; i++) {
//			if(ls.get(i))
//		}
		if(n>0) {
			a=n%10;
			b=n/10;
			if(b>=5 && b<9) {
				System.out.print(ls.get(10));
				b=b-5;
			}
			else if(b==9) {
				
				
				System.out.print(ls.get(a-1));
				
				System.out.print(ls.get(11));
				
			}
			
			else {
			for (int i = 1; i <= b; i++) {
				System.out.print(ls.get(9));
			}
			
		}
		}
		
		
	}
}
