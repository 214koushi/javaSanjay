package String;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemovalDuplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="I am from am from Testyantra";
		String[] s1 = s.split(" ");  
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		for(String x:s1) {
		hs.add(x);
		}
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+ "  ");
		}
		
		
	}

}
