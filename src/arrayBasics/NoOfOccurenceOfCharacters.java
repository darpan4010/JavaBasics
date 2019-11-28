package arrayBasics;

import java.util.HashMap;
import java.util.Map;

public class NoOfOccurenceOfCharacters {
	static final int MAX_CHAR = 256; 
	static void characterCount(String inputString) 
	{ 
		// Creating a HashMap containing char 
		// as a key and occurrences as  a value 
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>(); 

		// Converting given string to char array 	  
		char[] strArray = inputString.toCharArray(); 

		// checking each char of strArray 
		for (char c : strArray) { 
			if (charCountMap.containsKey(c)) { 

				// If char is present in charCountMap, 
				// incrementing it's count by 1 
				charCountMap.put(c, charCountMap.get(c) + 1); 
			} 
			else { 

				// If char is not present in charCountMap, 
				// putting this char to charCountMap with 1 as it's value 
				charCountMap.put(c, 1); 
			} 
		} 

		// Printing the charCountMap 
		for (Map.Entry entry : charCountMap.entrySet()) { 
			System.out.println(entry.getKey() + " " + entry.getValue()); 
		} 
	} 

	static void getOccuringChar(String str) 
	{ 
		// Create an array of size 256 i.e. ASCII_SIZE 
		int count[] = new int[MAX_CHAR]; 

		int len = str.length(); 

		// Initialize count array index 
		for (int i = 0; i < len; i++) {
			count[str.charAt(i)]++;
			System.out.println(count[str.charAt(i)]);
		}

		// Create an array of given String size 
		char ch[] = new char[str.length()]; 
		for (int i = 0; i < len; i++) { 
			ch[i] = str.charAt(i); 
			int find = 0; 
			for (int j = 0; j <= i; j++) {
				// If any matches found 
				if (str.charAt(i) == ch[j])  
					find++;                 
			} 

			if (find == 1)  
				System.out.println("Number of Occurrence of " +str.charAt(i) + " is:" + count[str.charAt(i)]);             
		} 
	}
	
	static void getOccurancepractice(String myName) {
		char[] chArray = myName.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char i: chArray) {
			if(map.containsKey(i)) {				
				map.put(i, map.get(i)+1);
			}
			else {				
				map.put(i, 1);
			}				
		}
		for(Map.Entry entry : map.entrySet()) {			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "DARPAN"; 
//	   characterCount(str); 
//		getOccuringChar("Darpan");
	   getOccurancepractice("myName");
	}

}
