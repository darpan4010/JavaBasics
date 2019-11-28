package oopsConcepts;

class Adder{  
static int add(int a, double b){return (int) (a+b);}  
static double add(double a, double b){return a+b;}  
}  
public class MethodOverloading {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println(Adder.add(11,11));  
			System.out.println(Adder.add(12.3,12.6));  
	}

}
