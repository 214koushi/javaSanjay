package String;

public class Stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="MalayalaM";
		String s1="";
		for (int i =s.length()-1; i >=0 ; i--) {
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		if (s1.equals(s)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("no");
		}
		
	}

}
