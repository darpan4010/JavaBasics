package arrayBasics;

public class PrintSequenceofInt {

	
	public static String printSeq(String strSeqstrSeq)
	{
		int strLen = strSeqstrSeq.length();
		
		char array[] = strSeqstrSeq.toCharArray();
		int count=0;
		for(int i=0;i<array.length-1;i++){
			
			if(array[i]=='0') {
				count++;
			}			
			
		}
		System.out.println("Count of 0's ==>"+count);
		System.out.println("Count of 1's==>"+(strLen-count));
		
		for(int i=0;i<count;i++) {
			
			array[i]='0';
		}
		for(int i=count;i<(strLen);i++) {
			
			array[i]='1';
		}
		
		for(int i=0;i<strLen;i++){
			System.out.print(array[i]);
		}
		return strSeqstrSeq;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strSeq = "10010010011111";
		printSeq(strSeq);
	}

}
