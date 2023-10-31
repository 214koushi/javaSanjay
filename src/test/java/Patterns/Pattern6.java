package Patterns;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  * * * * *
		   * * * *
		    * * * 
		     * *
		      * 
		 */
		int n=5;
		for (int i = n; i >0; i--) {
			for (int j = n; j >=1; j--) {
			if (i>=j) {
				System.out.print("* ");
			}	
			else 
				System.out.print(" ");
		}
			System.out.println();
	}

}}
