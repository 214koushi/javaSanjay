package String;

import java.util.HashSet;

public class Stringss1 {

	public static void main(String[] args) {
		HashSet<Character> hs=new HashSet<Character>();
       String s="aeiouAEeeIOUA" ;
      char[] ch = s.toCharArray();
       char[]arr= {'a','e','i','o','u','A','E','I','O','U'};
       int count=0;
     
    /*   for(int i=0;i<ch.length;i++)
       {
    	   if (ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			count++;
		}*/
    	  
    	for (int i = 0; i < ch.length; i++) {
			for (int j = 1+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
				}
			}
			
		
    	   if (count>0) {
    		   System.out.println(ch[i]+""+count);
		}
    	   count=0;
    	}	
		
       
       
     
}}
