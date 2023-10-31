package String;

public class MInlengthvaluesinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] s= {"12","1234","12345","45","1434234"};
		   String min=s[0];       
		for (int i = 0; i <s.length; i++) {
			if (min.length()>s[i].length()) {
				min=s[i];
			} 
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()==min.length()) {
				System.out.println(s[i]);
			}
		}
		
	}

}
