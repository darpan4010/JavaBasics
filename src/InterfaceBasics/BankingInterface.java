package InterfaceBasics;

public interface BankingInterface {

	public void createAccount();
	public void payCreditcardBill();
	public void closeLoanAccount();
	public void openCurrentAccount();
	
	
	//My client will only give methods without any body and tells developers to implement the actual code. 
	//Its implementation is provided in BankInterfaceImplementation class. 
	//Client might give some methods with the signature.
	//All the methods in interface are public so that all other classes can use it extensively.
	
	
}
