package arrayBasics;

public class SumOfArrayElements {

	
	public void sumofArray(int array[])
	{
		
		int sum = 0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfArrayElements s = new SumOfArrayElements();
		int array[] = {3,4,6,5};
		s.sumofArray(array);
	}
	
}
