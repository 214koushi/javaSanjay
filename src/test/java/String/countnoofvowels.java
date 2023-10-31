package String;

public class countnoofvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="India";
		char[] ch = s.toCharArray();
		int count=0;
		int count1=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
			}
			else if (ch[i]!='A'||ch[i]!='E'||ch[i]!='I'||ch[i]!='O'||ch[i]!='U'||ch[i]!='a'||ch[i]!='e'||ch[i]!='i'||ch[i]!='o'||ch[i]!='u') {
				count1++;
			}
		}
		System.out.println(count1);
		System.out.println(count);
	}

}
