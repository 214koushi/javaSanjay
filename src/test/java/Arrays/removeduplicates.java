package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,4,5,4,3,2,1,0};
//using  map
LinkedHashMap<Object, Object> map =new LinkedHashMap<Object, Object>();
for (int i = 0; i < a.length; i++) {
	map.put(a[i], i);
}
for(Entry<Object, Object> hm:map.entrySet()) {
	System.out.println(hm.getKey());
}
//using set
LinkedHashSet<Integer> hs= new LinkedHashSet<Integer>();

for( int i:a) {
	hs.add(i);

}
System.out.println(hs);
}}
