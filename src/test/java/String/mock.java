package String;

import java.util.HashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class mock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//HashSet<Character> hs=new HashSet<Character>();
//		char[]a= {'a','b','c','d','e','a','b','c'};
//		
//		for (int i = 0; i < a.length; i++) {
//			hs.add(a[i]);
//		}
//		System.out.println(hs); // a b c d e
//	
//		for(Character abc:hs) {
//			int count=0;
//			for (int i = 0; i < a.length; i++) {
//				if (abc==(a[i])) {
//					count++;	
//				}
//			}
//			if(count>1) {
//				System.out.println(abc);
//			}
//			
//		}
		
		

			
			
	
	
	// primenos
	
	/*Scanner s= new Scanner(System.in);
     System.out.println("Enter the number");
     int num=s.nextInt();
     int count=0;
     for (int i = 2; i <=num/2; i++) {
		if (num%i==0) {
		count++;
		
		}
	}
     if (count>0) {
    	 System.out.println("number is not prime");
		
	} else {
          System.out.println("number is prime");
	}*/
	
		
		
		// vowels
	/*	
		String s="aAAAAifgjhgtfvoiutfthgbjchiod";
		char[] ch = s.toCharArray();
		char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		int count=0;
		try {
		for (int i = 0; i < vowels.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if(ch[j]==vowels[i]) {
					count++;
				}
				
			}
			if(count>0) {
				System.out.println(vowels[i]+" "+count);
			}
			
			count=0;
		}
		}
		catch (Exception e ) 
			// TODO: handle exception
		
	*/
		
		
	String str="manushyaaeiouu";
	char[] vo = {'a','e','i','o','u','A','E','I','O','U'};
	HashSet<Character>hs=new HashSet<Character>();
	int count1=0;
	char[] ch1 = str.toCharArray();
	for (int j = 0; j < vo.length; j++) {
	for (int i = 0; i < ch1.length; i++) {
//		if (ch1[i]=='A'||ch1[i]=='O'||ch1[i]=='E'||ch1[i]=='I'||ch1[i]=='U'||ch1[i]=='a'||ch1[i]=='e'||ch1[i]=='i'||ch1[i]=='o'||ch1[i]=='u') {
//			count1++;
//			hs.add(ch1[i]);
//		}
		if(ch1[i]==vo[i]) {
			count1++;
		}
		if (count1>0) {
			System.out.println(vo+"-->"+count1);
		}
	}
	
	
	
	

		
	
	
		
		
	}
}}
