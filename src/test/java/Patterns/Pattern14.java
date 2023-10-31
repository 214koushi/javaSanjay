package Patterns;

import org.testng.annotations.Test;

public class Pattern14 {

	
	@Test
	public void pattern14() {
		/*
		 abcde
		 abcde
		 abcde
		 abcde
		 abcde
		 */
		int n=5;
		for (int i = 0; i < n; i++) {
			char ch='a';
			for (int j = 0; j < n; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
	/*
	*
   ***
  *****
 *******
	 */
	@Test
	public void pattern15() {
		int n=5;
		
		for (int i = 0; i <n; i++) {
		for (int j = 0; j <n-i; j++) {
			
				System.out.print(" ");}
			for (int j = 0; j <2*i-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	/*
	
*****
****
***
**
*
	 */
	
	@Test
	public void pattern16() {
		int n=5;
		int a=1;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
	
	

	

}
