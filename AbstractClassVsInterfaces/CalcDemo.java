interface Calc{
	int calculator(int x, int y);
	int calculator2(int x, int y);
}
// SAM
@FunctionalInterface
interface MyCalc{
	int calculator(int x, int y);
	//int calculator2(int x, int y);
}
class Calc1 implements Calc
{
	public int calculator(int x, int y){
		return x + y;
	}
	public int calculator2(int x, int y){
		return x - y;
	}
}
public class CalcDemo {

	public static void main(String[] args) {
		/*Calc1 obj = new Calc1();
		int result = obj.calculator(10, 20);
		System.out.println("Sum is "+result);*/
		Calc add = new Calc(){
			public int calculator(int x, int y){
				return x + y;
			}
			public int calculator2(int x, int y){
				return x - y;
			}
		};
		/*Calc sub = new Calc(){
			public int calculator(int x, int y){
				return x - y;
			}
		};*/
		// Java 8 Lambda Expression
		MyCalc mul = (x,y)->{
			x++;
			y++;
			return x*y;
		};
		System.out.println(mul.calculator(10, 20));

	}

}
