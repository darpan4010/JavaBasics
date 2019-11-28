package arrayBasics;

import java.util.Arrays;

public class RemoveDuplicateinArray {

	static void findDuplicateNumber(int[] array, int n)
	{
		int j = 0;
		for(int i=0;i<n-1;i++) {
			
			if(array[i]!=array[i+1]) {
				
				array[j++] = array[i];
			}
				
		}
			array[j++] = array[n-1];
		for(int i=0;i<j;i++)
		{
			System.out.print(array[i]+ " ");
		}
		
	}
	
	public boolean removeDuplicateinString(String name) {
		
		for(int i=0;i<name.length();i++){
			for(int j=i+1;j<name.length();j++) {
				
				if(name.charAt(i)==name.charAt(j)) {
					return false;
				}
				
			}
		}
		return true;
	}
	
	public void printCountofDuplicatechar(String name1) {
		for(int i=0;i<name1.length();i++) {
			System.out.print(name1.charAt(i)+"\n");
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {10,20,10,20,30,30,50};
		Arrays.sort(array);
		int n = array.length;
		findDuplicateNumber(array,n);
		RemoveDuplicateinArray obj = new RemoveDuplicateinArray();
		System.out.println(obj.removeDuplicateinString("Darpan"));
		obj.printCountofDuplicatechar("SATHE");
	}

}
