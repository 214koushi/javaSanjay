package String;

import java.util.Iterator;

public class Additionoftwodigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int tsum=0;
		String s="1a2ab13c9d1e3";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='0'&& ch[i]<='9') {
				int n=Integer.valueOf(ch[i])-48;
				tsum=tsum*10+n;
			}
			else {
				sum=sum+tsum;
				tsum=0;
			}
		}
		sum+=tsum;
		System.out.println(sum);
	}

}
