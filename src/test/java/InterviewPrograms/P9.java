package InterviewPrograms;

import org.testng.annotations.Test;

public class P9 {

	@Test
	public void printRemainingnosinArray() {
		
		int a[] = {1,2,5};
		int b[]= {1,2,3,4,5,6,7,8,9,10};
		int c[]=new int[b.length];
		int i=0, k = 0 ;
		try {
			for (i = 0; i < b.length; i++) { // 0 0<10 1 2
				if (b[i]==a[i]) { //1==1t
					
				}
				else {
					
					c[k]=b[i];
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			c[i]=b[i];
		}
		
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}
	}
	
	@Test
	public void pas() {
		int a[] = {1,2,5};
		int b[]= {1,2,3,4,5,6,7,8,9,10};
		int c[]=new int[b.length];
		int k=0;
		try {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(b[j]==a[i]) {
					break;
				}
				else {
					c[k]=b[j];
					break;
				}
			}
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}
	}











}

