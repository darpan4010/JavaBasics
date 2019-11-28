package collectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashmapHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//###################################HASHMAPS##########################
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(null, "D");
		map.put(null, "A");
		map.put(null, "R");
		map.put(4, "A");
		
		for(Map.Entry m : map.entrySet()) {
			
			System.out.println("HASHMAP IS:- "+m.getKey() +" "+ m.getValue());
		}
		
		
		//###################################HASHTABLES##########################
		
		Hashtable<Integer, String> ht = new Hashtable<Integer,String>();
				ht.put(1, "D");
				ht.put(2, "D");
				ht.put(3, "D");
		
				for(Map.Entry hmt : ht.entrySet()) {
					
					System.out.println("HASHTABLE IS:- "+hmt.getKey()+" "+hmt.getValue());
				}
	}

}
