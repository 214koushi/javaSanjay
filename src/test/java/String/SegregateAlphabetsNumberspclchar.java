package String;

public class SegregateAlphabetsNumberspclchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="a1b2%c@3";
		String s2="";
		String s3="";
		String s4="";
		String s5="";
		
		
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='A' && ch[i]<='Z') {
				s2+=ch[i];
			} else if (ch[i]>='a' && ch[i]<='z') {
				s3+=ch[i];
			} else if (ch[i]>='0' && ch[i]<='9') {
				s4+=ch[i];
			}else {
				s5+=ch[i];
			}	
		}
		String s1 = s2+" "+s3+" "+s4+" "+s5;
		System.out.println(s1);
	}

}
