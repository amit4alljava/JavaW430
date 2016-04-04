abstract class Loan{
	 abstract void roi();
		
	void applyForLoan(){
		System.out.println("Common Way Apply For Loan");
	}
}
class HomeLoan extends Loan
{
	
	void roi(){
		System.out.println("11% ROI");
	}
}
class AutoLoan extends Loan
{
	@Override
	void roi(){
		System.out.println("14% ROI");
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		//Loan x = new Loan();
		Loan loan = new AutoLoan();
		loan.applyForLoan();
		loan.roi();
	}

}
