package Patterns;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		
		for (int i = 1; i <=n; i++) {
			int a=1;
			for (int j = 1; j <=n; j++) {
				System.out.print(a++);
			}
			System.out.println();
		}
	}

}
