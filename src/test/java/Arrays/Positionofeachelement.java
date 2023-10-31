package Arrays;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class Positionofeachelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /// 1stmethod
		int[] a= {2,3,1,4,1,3,5,2};
		HashSet<Integer>hs=new HashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
	        if(hs.add(a[i])==true) { 
			System.out.println(a[i]+"--->"+(i+1));
	        }
		}	
		//2ndmethod
		LinkedHashMap<Integer,Object>hs1=new LinkedHashMap<Integer,Object>();
		for (int i = 0; i < a.length; i++) {
			hs1.put(a[i],i);
		}
		for( Entry<Integer, Object> k:hs1.entrySet()) {
			for (int i = 0; i < a.length; i++) {
				if (k.getKey()==a[i]) {
					System.out.println(k.getKey()+"----->"+(i+1));
					break;
				}
			}
		}
	
       //3 rdmethod
	HashSet<Integer>hs2=new HashSet<Integer>();
	for(int i=0;i<a.length;i++) {
		hs2.add(a[i]);
		
	}
	for(Integer j:hs2)
		{
		for (int i = 0; i < a.length; i++) {
			if (j==a[i]) {
				System.out.println(j+"--->"+(i+1));
				break;
			}
		}
		}
	}}
