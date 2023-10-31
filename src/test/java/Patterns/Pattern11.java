package Patterns;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
11111
2222
333
44
5
		 */
		int n=5;
		int a=1;
		for (int i = 1; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(1);
			}
			
			System.out.println();
		}
	}

}
