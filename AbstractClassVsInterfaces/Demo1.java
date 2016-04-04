abstract class Account
{
	void deposit(){
		System.out.println("Account Class Deposit Call..");
	}
	abstract void roi();
}
class SavingAccount extends Account{
	@Override
	void roi(){
		System.out.println("Bank Pay");
	}
	void doorToDoorService(){
		System.out.println("Saving Account Door to Door Service...");
	}
}
class CurrentAccount extends Account{
	@Override
	void roi(){
		System.out.println("U Pay");
	}
	void odLimit(){
		System.out.println("OD Limit in CurrentAccount");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		//Account a = new Account();
		SavingAccount sa = new SavingAccount();
		sa.deposit();
		sa.doorToDoorService();

	}

}
