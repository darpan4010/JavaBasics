package InterfaceBasics;

public class BankInterfaceImplementation implements BankingInterface,DomainClient {
// One class ca implement more than one interface. 
// Just separate by using comma.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankInterfaceImplementation bi = new BankInterfaceImplementation();
		bi.createAccount();
		bi.payCreditcardBill();
		bi.openCurrentAccount();
		bi.closeLoanAccount();
		bi.investments();
		
		//THis is run time polymorphism. Because if you will not get login method using binter object. 
		//Bcoz return type of object is BankingInterface here. And login method is not available in that interface class. 
		BankingInterface binter = new  BankInterfaceImplementation();
		binter.createAccount();
		binter.payCreditcardBill();
		binter.openCurrentAccount();
		binter.closeLoanAccount();
		
		
	}

	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("Inside createAccount");
	}

	@Override
	public void payCreditcardBill() {
		// TODO Auto-generated method stub
		System.out.println("Inside payCreditcardBill");
	}

	@Override
	public void closeLoanAccount() {
		// TODO Auto-generated method stub
		System.out.println("Inside closeLoanAccount");
	}

	@Override
	public void openCurrentAccount() {
		// TODO Auto-generated method stub
		System.out.println("Inside openCurrentAccount");
	}

	public void logintoBankingApp()
	{
		System.out.println("Inside logintoBankingApp ");
	}

	@Override
	public void investments() {
		// TODO Auto-generated method stub
	
		System.out.println("Inside investments");
	}
	
}
