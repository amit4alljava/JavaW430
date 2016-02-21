import java.util.Scanner;
public class ScannerDemo {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("पहला नंबर दर्ज करे ");
	int firstNo= scanner.nextInt();
	System.out.println("दूसरा नंबर दर्ज करे ");
	int secondNo = scanner.nextInt();
	int result = firstNo + secondNo;
	System.out.println("परिणाम यह है  "+result);
	scanner.close();
}
}
