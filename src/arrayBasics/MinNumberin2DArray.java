package arrayBasics;

public class MinNumberin2DArray {


	public void minNumberin2Darray()
	{

		/*7 8 9
		6 5 4
		3 2 1*/

		int array[][] = {{7,8,9},{6,5,4},{3,222,11}};
		int min = array[0][0];
		//print the 2D array
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{

				System.out.print(array[i][j]+"\t ");

			}
			System.out.println(" ");

		}


		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i][j]<min)
				{
					min= array[i][j];
				}
			}

		}


		System.out.println("Min number in 2D array is:->  "+min);
	}

	public void maxNumberin2Darray()
	{

		/*7  8    9
		6  5    4
		3  222  11*/

		int array[][] = {{7,8,9},{6,5,4},{3,222,11}};
		int max = array[0][0];
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i][j]>max)
				{
					max= array[i][j];
				}
			}

		}
		System.out.println("Max number in 2D array is :-> "+max);
	}

	
	public void maxnumberCalculation()
	{

		/*77  8    9
		  6   5    4
		  33  222  11*/

		int array[][] = {{77,8,9},{6,5,4},{33,222,11}};
		int min = array[0][0];
		int minColumn = 0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i][j]<min)
				{
					min= array[i][j];
					minColumn = j;
				}
			}
		}
		int maxCol = array[0][minColumn];
		int k=0;
		while(k<3)
		{
			
			if(array[k][minColumn]>maxCol)
			{
				
				maxCol=array[k][minColumn];
			}k++;
		}
		System.out.println(maxCol);
			
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinNumberin2DArray m = new MinNumberin2DArray();
		m.minNumberin2Darray();
		m.maxNumberin2Darray();
		//Find out the min number in a matrix. Once u get the min number then in same column what is the max number. The max number is the final output.
		/*1. Find out the min number
  		  2. Get the row number
  		  3. get the column
  		  4. Find the max number in that column
		 */
		m.maxnumberCalculation();
	}

}
