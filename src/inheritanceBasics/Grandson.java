package inheritanceBasics;

public class Grandson extends Sons{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grandson s = new Grandson();
		
		Sons s2 = new Sons(); 
		Sons s1 = new Grandson();
	s.city();
	s.country();
	s.addNumbers();
	s1.addNumbers();
	s2.addNumbers();
	}

}
