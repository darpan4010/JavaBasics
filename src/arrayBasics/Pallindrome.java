package arrayBasics;

public class Pallindrome {

	
	public void revofString()
	{
		String str = "Darpan";
		String newStr = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			//Print rever of string "Darpan"
			System.out.println(str.charAt(i));
			//Creating a new string to check if it is palindrome or not. 
			newStr+=str.charAt(i);
		}
		System.out.println(newStr);
		if(newStr.equalsIgnoreCase(str))
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("Its not palindrome");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pallindrome rev = new Pallindrome();
rev.revofString();
	}

}
