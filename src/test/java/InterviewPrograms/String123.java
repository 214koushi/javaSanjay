package InterviewPrograms;

import org.testng.annotations.Test;

public class String123 {

	@Test
	public void aa() {
		 String s="wwawapreethea";
		 char[] st = s.toCharArray();
		 int j=0;
		 for (int i = 0; i < st.length; i=j) 
		 {
			 int count=1;
			for (j = i+1; j<st.length; j++) 
			{
				if(st[i]==st[j])
				{
					 
					count++;
				}
			else 
			{
				break;
				}
				
			}
			System.out.print(st[i]+""+count+" ");
		}
		 System.out.println();
	}
	
	
	@Test
	public void a3() {
		String s="asswwdedd";
		int j=0;
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i=j) {
			int count=1;
			for ( j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
				}
				else {
					break;
				}
			}
			System.out.println(ch[i]+""+count+" ");
		}
	}
}
