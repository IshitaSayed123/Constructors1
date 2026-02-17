package Practice;

public class BankAccount {
	private int accountNumber;
	private String HolderName;
	private double balance;

	public BankAccount(int accountNumber, String HolderName,  double balance) {
		this.accountNumber=accountNumber;
		this.HolderName=HolderName;
		this.balance=balance;
	}
	//method to deposit money
	public  void Deposit(double amount) {
		if(amount>0) {
			amount+=balance;
			System.out.println(amount +"Rs"+" deposited successfully ");
		}else {
			System.out.println("Invalid Amount");
		}
	}
	// method for display details
	public void displayDetails() {
		System.out.println("Account Number: "+ accountNumber + "\n"+
				           "Holder Name: "+ HolderName + "\n"+
				            "Balance: "+ balance + "\n" +
				            "-------------------------------");
	}



}

