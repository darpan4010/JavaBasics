package arrayBasics;

public class ReverseOfString {

	
	public static String revofString(String revString)
	{
		
//		System.out.println(revString);
		int strLen = revString.length();
		
		for(int i=strLen-1;i>=0;i--)
		{
			
			System.out.print(revString.charAt(i));
		}
		
		
		return revString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mainStr = "Darpan is a boy fsdfsfs fdfsdf ewrrrr";
		String arr[] = mainStr.split(" ");
//		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
		for(int j=0;j<arr.length;j++) {
			
			revofString(arr[j]);
			System.out.print(" ");
		}
		
	}

}
