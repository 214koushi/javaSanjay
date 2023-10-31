package Arrays;

import java.util.HashMap;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Additionoftwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int[]a= {2,6,4};
		int[] b= {1,5,8,3};
		int length=a.length;
		if (a.length<b.length) {
			length=b.length;
		}
		for (int i = 0; i < length; i++) {
			try {
				System.out.println(a[i]+b[i]+" ");
			} catch (Exception e) {
				if (a.length<b.length) {
					System.out.println(b[i]);
				}
				else {
					System.out.println(a[i]);
				}
			}
		
		
		}
		
	}
	@Test
	public void Additing() {
		int[]a= {3,4,2,5};
		int b[]= {2,8,9};
		int length=a.length;
		if (a.length<b.length) {
			length=b.length;
		}
		
		for (int i = 0; i < length; i++) {
			try {
			System.out.println(a[i]+b[i]+" ");
		}
		catch(Exception e){
			if (a.length<b.length) {
				System.out.println(b[i]);
			}
			else {
				System.out.println(a[i]);
			}
		}}
	}
	@Test
	public void merge() {
		int[]a= {3,4,2,5};
		int b[]= {2,8,9};
		int c[]=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[(a.length)+i]=b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
	
	@Test
	public void pattern2() {
		
		/*
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
		 */
		int n=5;
		for (int i = 0; i < n; i++) {
			int m=(i*2)+1;
			int x=1;
			for (int j = 0; j <n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=m; j++) {
				if (j<=i) {
					System.out.print((x++));
				}
				else {
					System.out.print((x--));
				}
			}
			System.out.println();
		}
	}
@Test
public void lk() {
	int n=11;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (i==0||j==(n-1)||i==n-1||j==0||i+j==(n-1)||i==j) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}
}
}
