package String;

public class DuplicatesCharremoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Testyantra";
StringBuilder s1=new StringBuilder();
char[] ch = s.toCharArray();
for (int i = 0; i < ch.length; i++) {
	boolean count=false;
	for (int j = i+1; j < ch.length; j++) {
		if (ch[i]==ch[j]) {
			//System.out.println(ch[i]);
			count=true;
			break;	
		}
	}
	if (!count) {
		s1.append(ch[i]);
	}
	
}
System.out.println(s1);
	}

}
