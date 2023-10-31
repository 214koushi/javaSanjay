package Arrays;

public class FirstmininimumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {2,5,8,1,0};
 int firstmin=a[0];
for (int i =1 ; i < a.length; i++) {
	
	if (a[i]< firstmin ) {
		
		firstmin=a[i];
		
		break;
	}
	
}
System.out.println(firstmin);


	}}

