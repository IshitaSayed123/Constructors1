package Practice;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount account1=new BankAccount(12345, "ishita", 0);
		account1.Deposit(20000);
		account1.displayDetails();
		BankAccount account2=new BankAccount(67890, "jaha", 30000);
		account2.Deposit(50000);
		account2.displayDetails();
		

	}

}
