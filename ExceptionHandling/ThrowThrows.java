class LoginView{
	// Design 
	void doLogin(){
		System.out.println("Login Design Appear");
		System.out.println("User enter the Login things");
		System.out.println("Submit the Login Values");
		LoginHelper helper = new LoginHelper();
		try{
		helper.doLogin();
		System.out.println("Welcome User");
		}
		catch(ArithmeticException e){
			System.out.println("Some Problem Kindly Login After Some Time "+e);
			e.printStackTrace();
		}
		
		System.out.println("LoginView Ends...");
	}
}
class LoginHelper{
	// Business Logic
	void doLogin() throws ArithmeticException{
		System.out.println("User Already Login or Not");
		LoginDAO loginDAO = new LoginDAO();
		loginDAO.doLogin();
		System.out.println("Login Success");
		System.out.println("Logic Ends...");
	}
}
// Data Access Object
class LoginDAO{
	// DB Logic
   void doLogin() throws ArithmeticException{
		System.out.println("Connection Open");
		System.out.println("Query for Userid and Password");
		try{
		int e = 10/0;
		System.out.println("get the result and send to Helper");
		
		}
		finally{
			System.out.println("Connection Close");	
		}
	}
}
public class ThrowThrows {

	public static void main(String[] args) {
		LoginView view = new LoginView();
		view.doLogin();

	}

}
