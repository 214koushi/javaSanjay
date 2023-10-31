package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class First3maxsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {5,6,3,2,1,4,7};
		Arrays.sort(a);
		
		/*for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		int sum=0;
		for (int i = a.length-1; i >=a.length-3; i--) {
		sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
