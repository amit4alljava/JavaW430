
public class Demo {

	public static void main(String[] args) {
		Demo obj = new Demo();
		
		//System s = new System();
		int a = 100;  // 4 byte
		int b = 200;
		int c = a + b;
		int d = 90;
		int e = 3;
		d++;
		++d;
		e = d + c + a - b;
		e = d + c-  d/2;
		
		for(int i = 1; i<=10; i++){
		System.out.println("I is "+i);	
		}
		
		System.out.println("A is "+a
				+" and B is "+b+" Sum is "+c);
		//System.out.println("Sum is "+(a+b));
		//System.out.println("Sum is "+c);
		

	}

}
