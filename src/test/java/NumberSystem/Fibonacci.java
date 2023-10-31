package NumberSystem;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int sum=0;
		while(a<=100) {
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
		}
	}
}