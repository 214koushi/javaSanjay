package String;

public class Positionofallchars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s="Testyantra";
	        char[] ch = s.toCharArray();
	        for (int i = 0; i < ch.length; i++) {
				System.out.println("position of ' "+ch[i]+" ' is "+(i+1));
			}
	}

}
