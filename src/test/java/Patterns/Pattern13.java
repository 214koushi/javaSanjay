package Patterns;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
ABCDE
FGHIJ
KLMNO
PQRST
UVWXY

		 */
		int n=5;
		char ch='A';
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
