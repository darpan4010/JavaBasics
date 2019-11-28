package javaBasics;

public class JavaCalculator {

	public void add(int a, int b)
	{
		int sum;
		sum=a+b;
		System.out.println("Sum of two numbers is :- "+sum);
		
	}
	
	public void subtract(int a, int b)
	{
		int subtraction;
		subtraction=a-b;
		System.out.println("Sum of two numbers is :- "+subtraction);
		
	}
	public void multiply(int a, int b)
	{
		int multiplication;
		multiplication=a*b;
		System.out.println("Sum of two numbers is :- "+multiplication);
		
	}
	public void division(double a, double b)
	{
		double division;
		division=a/b;
		System.out.println("Sum of two numbers is :- "+division);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaCalculator jc = new JavaCalculator();
		jc.add(2, 3);
		jc.subtract(4, 2);
		jc.multiply(3, 4);
		jc.division(8, 3);
	}

}
