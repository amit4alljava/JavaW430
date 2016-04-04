import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
interface TT{
	public abstract void print();
	public default void output(){
		System.out.println("Logic...");
	}
}
interface E
{
	default void show(){
		System.out.println("E Logic");
	}
}
interface P
{
	default void show(){
		System.out.println("P Logic");
	}
}
class DD{
	
}
class D1  implements E,P{
@Override	
public void show(){
	E.super.show();
	P.super.show();
	System.out.println("NOw Parent Gone...");
}
	
	
}

/*interface T extends P,E{
	void output();
}*/
/*class D implements T{
	
}*/
public class InterfaceRules {

	public static void main(String[] args) {
		/*WindowListener l;
		WindowAdapter w;*/
		D1 obj = new D1();
		obj.show();
		

	}

}
