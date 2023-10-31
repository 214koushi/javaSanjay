package NumberSystem;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int i,j;
		for ( i = 0; i<=10 ; i++) {
			for ( j = 2; j<i; j++) {
				if (i%j==0) 
					break;
			}
			if (i==j) 
				System.out.println(i);			
}		
	}
}
