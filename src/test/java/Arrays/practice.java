package Arrays;

import java.util.LinkedHashSet;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {4,5,6};
		int fmin=a[0];//4
		int smin=a[0];//5 4
		for (int i = 0; i < a.length; i++) {
			if (a[i]<=fmin) {
				if (a[i]!=fmin) {
					smin=fmin;
				}
				fmin=a[i];
			}
			else if (smin==fmin||smin>a[i]) {
				smin=a[i];
			}
			}
		System.out.println(fmin);
		System.out.println(smin);
}
}

