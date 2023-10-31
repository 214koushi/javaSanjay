package InterviewPrograms;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st="welcome to explore";
		String[] s = st.split(" ");
		s[0]=s[0]+" "+s[s.length-1];
		s[s.length-1]=s[s.length-1]+" "+s[0];
		s[0]=s[0].split(" ")[1];
		s[s.length-1]=s[s.length-1].split(" ")[1];
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
			}
		
	}

}
