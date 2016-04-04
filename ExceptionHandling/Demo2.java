
public class Demo2 {
	static void doDBOperation(){
		int a = 2;
		try{
			System.out.println("Connection Open...");
			System.out.println("Do Query to the DB");
			String b = null;
			int e = 10/a;
			int d[]={10,20,30};
			if(d.length==3){
				System.exit(0);
				//return ;
			}
			//d[10]=1000;
			//b= b.toUpperCase();
			System.out.println("Get Query Result");
			System.out.println("Do Processing of Result");
			//System.out.println("This will never Execute...");
			
		}
		
		catch(ArithmeticException e){
			System.out.println("Divide By Zero Occured... "+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Is Out of Bound....");
		}
		catch(NullPointerException e){
			System.out.println("String is Null");
		}
		catch(Exception e){
			System.out.println("Some Problem Contact to System Admin");
		}
		finally{
			System.out.println("Connection Close");
			// It Always Execute
			// Resource Clean Up Code Put Here
		}
	}
	// Be Specific in Exception
	public static void main(String[] args) {
		doDBOperation();

	}

}
