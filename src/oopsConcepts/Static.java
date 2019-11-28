package oopsConcepts;

public class Static {
	static int a=9;
	public void run() {
		System.out.println("Static method running");
	}
	public void print(int a) {
		
		a=a+2;
		System.out.println(a);
		System.out.println(this.a);
		this.a=a;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		
		System.out.println(a);
		Static s = new Static();
//		s.run();
		s.print(10);
	}

}
