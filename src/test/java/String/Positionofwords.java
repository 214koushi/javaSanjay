package String;

import java.util.LinkedHashSet;

public class Positionofwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am from am from Testyantra";
		String[] s1 = s.split(" ");  
		for (int i = 0; i < s1.length; i++) {
			System.out.println("the position of "+s1[i]+" is "+(i+1));
		}
	}

}
