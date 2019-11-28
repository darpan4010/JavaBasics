package arrayBasics;

public class MultiDimentionalArray {
	int i,j,k,l,m,n;
	int rows=3;
	int columns=3;
	
	public void multidimentionalArray()
	{
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+"\t ");
			}
			System.out.println(" ");
		}
		
		System.out.println("\n");
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int k=0;k<b.length;k++)
		{
			for(int l=0;l<b.length;l++)
			{
				System.out.print(b[k][l]+"\t ");
			}
			System.out.println(" ");
		}
		System.out.println("\n");
		
		for(int m=0;m<rows;m++)
		{
			for(int n=0;n<columns;n++)
			{
				
				System.out.print(a[m][n] + b[m][n]+"\t ");
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MultiDimentionalArray mda = new MultiDimentionalArray();
		mda.multidimentionalArray();
	}

}
