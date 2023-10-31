package NumberSystem;

public class PrimenosinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {1,9,3,5,2,6,7,4};
		boolean flag=false;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				flag=true;
				break;
			}
		}
		if (!flag) {
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}
	}

}
