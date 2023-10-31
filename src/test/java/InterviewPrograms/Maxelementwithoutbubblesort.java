package InterviewPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Maxelementwithoutbubblesort {

	@Test
	public void withoutbubble() {
		int[]a= {7,-3,0,2,1,-9};
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>=a[0]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	
	@Test
	public void multiplyOfmax3elements() {
		int[]a= {7,-3,0,2,1,-9};
		Arrays.sort(a);
		int sum=1;
     // TreeSet<Integer> hs=new TreeSet<Integer>();
	for (int i = a.length-1; i >=a.length-3 ; i--) {
		sum=sum*a[i];
		
	}
	System.out.println(sum);
	}
	
	
	@Test
	public void first3minofsum() {
		
		int[]a= {7, -6, 11, 9, 0, 4};
		int min=0;
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
		//System.out.println(a[i]);
		}
		for (int i = 0; i < 3; i++) {
			min+=a[i];
		}
		System.out.println(min);
	}
	
	}
	

