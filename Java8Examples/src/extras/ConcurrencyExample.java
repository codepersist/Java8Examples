package extras;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyExample {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>(); 
		concurrentHashMap.putAll(Map.of("AAA", 1, "BBB", 2, "CCC", 3, "DDD", 4, "EEE", 5, "FFF",6, "GGG",7));		 
		
		//parallelism threshold
		/*This is to define how you wanted to execute the operations — sequentially or in parallel. 
		 * Suppose you have given a parallelismThreshold as 2. So as long as there are fewer than two elements in your map, 
		 * it would be sequential. Otherwise, it's parallel (depends on the JVM).*/
		concurrentHashMap.forEach(2,(k,v) -> System.out.println("Key-> " + k  + "Value ->" + v));
		
		String result = concurrentHashMap.search(1, (k,v) ->{
			if(k.equals("FFF"))
				return k + "->" + v;
			return null;
		});
		
		System.out.println("Search Result " + result);
		
		//Compute -  to compute on map & add it back to the same map.
		System.out.println("Display 1 ->" +  concurrentHashMap.compute("CCC", (k,v) -> v == null ? 105 : v+ 200));
		System.out.println(concurrentHashMap);
	}

}
