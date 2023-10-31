package String;

public class NoofDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Testyantra";
        char[] ch = s.toCharArray();
        int count=0;
        for (int i = 0; i < ch.length; i++) {
        	
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
					break;
				}
			}
		}
        System.out.println("the no of duplicates is >>>>> "+count);
	}

}
