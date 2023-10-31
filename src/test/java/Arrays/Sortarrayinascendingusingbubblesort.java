package Arrays;

public class Sortarrayinascendingusingbubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {20,15,30,10,50,06,75};
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if (a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
		
		
	}

}
