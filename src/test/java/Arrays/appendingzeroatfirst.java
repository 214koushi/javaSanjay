package Arrays;

public class appendingzeroatfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int[]a= {9,0,0,8,4,3,0};
		int b[]=new int[a.length];
		int m=0;
		int n=a.length-1;
		for (int i = 0; i < b.length; i++) {
			if (a[i]==0) {
				b[m]=a[i];
				m++;
			}
			else {
				b[n]=a[i];
				n--;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
