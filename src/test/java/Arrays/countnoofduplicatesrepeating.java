package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class countnoofduplicatesrepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a= {2,3,1,4,1,3,5,2};
		// without using collection
		for (int i = 0; i < a.length; i++) {
			int count =0;
			for (int j = 0; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;	
				}	
			}
			
		System.out.println(a[i]+">"+count);
		
		}
		System.out.println("-------------------------------------------------------------------------------------------");
		//using collection
		LinkedHashSet<Integer>hs=new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		for(Integer in:hs) {
			//System.out.println(in);
			int vcount=0;
			for (int i = 0; i < a.length; i++) {
				if (in==a[i]) {
					vcount++;
				}
			}
			System.out.println(in+">>>>> "+vcount);
		}
		System.out.println("-------------------------------------------------------------------------------------------");
	
		// using map
		LinkedHashMap<Integer, Object> map =new LinkedHashMap<Integer, Object>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], i);
		}
		for(Entry<Integer, Object> k:map.entrySet()) {

			int acount=0;
			for (int i = 0; i < a.length; i++) {
				if (k.getKey()==a[i]) {
					acount++;
				}
			}
			System.out.println(k.getKey()+">>>>> "+acount);
		}
		
	}

}
