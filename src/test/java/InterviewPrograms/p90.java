package InterviewPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class p90 {
@Test
public void Stringeeee() {
//s , se , sel , sele , selen , seleni , seleniu , selenium
	String s="selenium";
	String rev="";
	char[] ch = s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		rev=rev+ch[i];
		System.out.print(rev+" , ");
	
	}
}


@Test
public void stringeee1() {
	String s="aabbaa"; // aa , ab , bb , ba , aa
	char[] ch = s.toCharArray();
	try {
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+""+ch[i+1]+" , ");
			
		}
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println();
	}
	
}
@Test
public void Stringeee2() {
	String s="aabbaa"; // remove duplicates
	char[] ch = s.toCharArray();
	HashSet<Character>hs=new HashSet<Character>();
	for (int i = 0; i < ch.length; i++) {
		hs.add(ch[i]);
	}
	for(Character cha:hs) {
         System.out.print(cha+"");
}
	System.out.println();
}

@Test
public void reverse() {
	
	String s="reverse";
	char[] ch = s.toCharArray();
	String s2="";
	for (int i = ch.length-1; i >=0 ; i--) {
		s2+=ch[i];
	}
	System.out.println(s2);
}

@Test
public void bubble() {
	int []a= {1,2,3,9,4,7};
	for (int i = 0; i < a.length-1; i++) {
		for (int j = 0; j < a.length-i-1; j++) {
			if (a[j]<a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}


@Test
public void removewhiteplacecomma() {
	
	String s="hai am from madhugiri";
	char[] ch = s.toCharArray();
	/*for (int i = 0; i < ch.length; i++) {
		if (ch[i]==' ') {
			ch[i]=',';
		}
		System.out.print(ch[i]);
	}*/
	String s1 = s.replaceAll("\\s", ",");
	System.out.println(s1);
	
}

@Test
public void convertlist2array() {
	
	ArrayList<Integer>ls=new ArrayList<Integer>();
	ls.add(1);
	ls.add(2);
	ls.add(3);
	ls.add(4);
	ls.add(5);
	ls.add(6);
	System.out.println(ls);
	Object[] a = ls.toArray();
	for(Object o:a) {
		System.out.println(o);
	}		
}

@Test
public void reversewords() {
	String s="ok google call me";
	
	String[] s1 = s.split(" ");
	for (int i = 0; i < s1.length; i++) {
		String ab=s1[i];
		for (int j = ab.length()-1; j >=0 ; j--) {
			System.out.print(ab.charAt(j));
		}
		System.out.print(" ");
	}
}

@Test
public void vowelsinStringarray() {
	String [] s= {"Vivek","Vijay","Jawahar"};
	int vivek=0,vijay=0,jaw=0;
	for (int i = 0; i < s.length; i++) {
		String as=s[i];
		for (int j = 0; j < as.length()-1; j++) {
			if (as.charAt(j)=='A'||as.charAt(j)=='E'||as.charAt(j)=='O'||as.charAt(j)=='I'||as.charAt(j)=='U'||as.charAt(j)=='a'||as.charAt(j)=='i'||as.charAt(j)=='e'||as.charAt(j)=='o'||as.charAt(j)=='u') {
			if (i==0) {
				vivek++;
			}
			else if (i==1) {
				vijay++;
			}
			else if (i==2) {
				jaw++;
			}
			
			}
		}
	}
	System.out.println("Vivek --->"+vivek);
	System.out.println("Vijay -->"+vijay);
	System.out.println("Jawahar --->"+jaw);
}

@Test
public void primeandPalindrome() {
	
	int n1=15;int s=0;
	for (int i = 2; i < n1; i++) {
		
		if (n1%i==0) {
			s++;
		}
	}
	if (s>1) {
		System.out.println(n1+" is not prime");
	}
	else {
		System.out.println(n1+" is prime");
	}
	
	
}

@Test
public void stringpgm() {
String s="mizzsysumiu";

//TreeSet<Character>hs=new TreeSet<Character>();
//char[] ch = s.toCharArray();
int min = s.charAt(0);
String s1="";
for (int i = 0; i < s.length(); i++) {
	if (s.charAt(i)<min) {
		min=s.charAt(i);
		
	}
	else {
		s1=s1+s.charAt(i);
	}
	
}
s1=min+s1;
System.out.println(s1);
}

}