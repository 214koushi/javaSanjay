package Arrays;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {7,5,6,3,8,4,3,9,2};
int count=0;
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if ((a[i]+a[j])==11) {
			count++;
		System.out.println(a[i]+"    "+a[j]);
		}
	}
}
System.out.println(count);
	}

}
