package String;

public class MaximumlengthValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[]= {"ab","abcd","mygvb","bv","yhcyhhgbdfgt","abhdfyhydwgy"};
		String max=s[0];
		for (int i = 0; i < s.length; i++) {
			if (max.length()<s[i].length()) {
				max=s[i];
			} 
		}
		for (int i = 0; i < s.length; i++) {
			if (max.length()==s[i].length()) {
				System.out.println(s[i]);
			}
		}
	}

}
