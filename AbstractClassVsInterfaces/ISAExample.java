class Account //extends Object
{
	void withDraw(){
		System.out.println("Account Class WithDraw");
	}
	void deposit(){
		System.out.println("Account Class Deposit");
	}
	void roi(){
		System.out.println("Sample ROI");
	}
}
class CurrentAccount extends Account
{
	void odLimit(){
		System.out.println("OverDraft Limit Feature");
	}
	//@Override
	void roi(){
		System.out.println("Current Account ROI is 7%");
	}
}
class SavingAccount extends Account{
	void roi(){
		System.out.println("Saving Account ROI is 4%");
	}
}
public class ISAExample {
	/*
	 * Polymorphic Method
	 */
	static void caller(Account account){
		account.withDraw();
		account.deposit();
		account.roi();
		
		if(account instanceof CurrentAccount){
			CurrentAccount ca = (CurrentAccount) account;  //Downcasting
			ca.odLimit();
		}
		System.out.println("*************************");
		
		
	}

	public static void main(String[] args) {
		caller(new SavingAccount());
		caller(new CurrentAccount());
		caller(new Account());
		// Upcasting
		/*Account account = new SavingAccount();
		account.withDraw();
		account.deposit();
		account.roi();*/
		//account.odLimit();

	}

}
