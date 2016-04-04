import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Demo1 {
	static int firstNo = 0;
	static Scanner scanner = new Scanner(System.in);
	static void getFirstNo(){
		try
		{
			System.out.println("Enter the First No");
			firstNo = scanner.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed , U Entered Characters");
			scanner.nextLine();
			getFirstNo();
			
		}
	}

	public static void main(String[] args) {
		
		try {
			FileOutputStream fo =new FileOutputStream("d:\\abcd.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		int firstNo = 0;
		int secondNo = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First No");
		try{
		 firstNo = scanner.nextInt(); //(Implicit Throw) throw new InputMisMatchException();
		}
		catch(InputMismatchException exception){
			System.out.println("Only Number Allowed , U Entered Characters");
			scanner.nextLine();
			System.out.println("Enter the First No");
			firstNo = scanner.nextInt();
		}
		System.out.println("Enter the Second No");
		try{
		 secondNo = scanner.nextInt();
		}
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed , U Entered Characters");
			scanner.nextLine();
			System.out.println("Enter the Second No");
			secondNo = scanner.nextInt();
		}
		try{
			if(firstNo>0 || secondNo>0){
					result = firstNo/secondNo;
			}
		}
		catch(ArithmeticException e){
			System.out.println("U Divide a Number with Zero ");
		}
		System.out.println("Result is "+result);
		scanner.close();
	}

}
