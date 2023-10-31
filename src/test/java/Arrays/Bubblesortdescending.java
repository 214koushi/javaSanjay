package Arrays;

public class Bubblesortdescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {5,3,7,9,1,6,10};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
