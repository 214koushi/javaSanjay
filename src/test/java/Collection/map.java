package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class map {

	@Test
	public void hmasg() {
		
		HashMap<Character, Integer>hm=new HashMap<>();
		hm.put('a', 3);
		hm.put('b', 2);
		hm.put('c', 1);
		hm.put('d', 21);
		System.out.println(hm.get('c'));
			
		}
	}

