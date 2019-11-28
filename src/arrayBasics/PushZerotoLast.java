package arrayBasics;

public class PushZerotoLast {

	public static int[] pushZero(int arr[], int n)
	{
		int count=0;
		for(int i=0;i<n;i++){

			if(arr[i]!=0) {

				arr[count++] = arr[i];				
				
			}
		}
		while (count < n) 
            arr[count++] = 0;
		return arr;		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,3,5,2,4,0,0,8,9,8,7,0,0,1};
		int strLen = arr.length;
		pushZero(arr, strLen);
		
		System.out.println();
		for(int i=0;i<strLen;i++)
		{
			System.out.print(arr[i]);
		}
		
		

	}

}
