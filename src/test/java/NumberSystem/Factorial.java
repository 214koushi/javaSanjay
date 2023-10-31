package NumberSystem;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 int num=5;
                 int fact=1;
                 int sum=0;
                 while (num>0) {
					fact=fact*num;
					num--;
					}
                 sum=sum+fact;
                 num=num/10;
                 System.out.println(sum);
	}

}
