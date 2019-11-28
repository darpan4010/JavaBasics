package printingpattern;

public class Starpattern {


	public void printPattern()
	{     
		//		       * 
		//	         * * 
		//	       * * * 
		//	     * * * * 
		//	   * * * * *  
		int n=5;
		// outer loop to handle number of rows 
		//  n in this case 
		for(int i=0;i<n;i++)
		{

			// inner loop to handle number spaces 
			// values changing acc. to requirement 
			for(int j=(n-i); j>0; j--) 
			{ 
				// printing spaces 
				System.out.print(" "); 
			} 

			//  inner loop to handle number of columns 
			//  values changing acc. to outer loop 
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}

			System.out.println();	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Starpattern sp = new Starpattern();
		sp.printPattern();
	}

}
