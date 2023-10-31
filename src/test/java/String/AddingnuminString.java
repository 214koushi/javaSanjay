package String;

public class AddingnuminString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="1a2ab13c9d1e3";
		
		int a1=0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
		if (ch[i]>='0'&& ch[i]<='9') {
			int n=ch[i]-48;
			a1=a1+n;
		}	
	}
		System.out.println(a1);
   //2nd method
		int b=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='0'&& ch[i]<='9') {
				Integer c = Integer.valueOf(ch[i])-48;
				b+=c;
			}
 }
		System.out.println(b);
}}
