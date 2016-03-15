class TT{
	int x ;
	TT(){
		x = 10;
		System.out.println("TT Default Cons");
	}
	TT(int x){
		this();
		System.out.println("TT One Param COns");
	}
	TT(int x, int y){
		this(10);
		System.out.println("TT Two Param Cons");
	}
}
class TT2 extends TT{
	int x;
	TT2(){
		super(10,20);
		x=1000;
		System.out.println("TT2 Default Cons");
	}
	TT2(int x){
		this();
		int  z = super.x + this.x + x;
		System.out.println("TT2 One Param COns "+z);
	}
	TT2(int x, int y){
		this(1);
		x++;
		//super();
		System.out.println("TT2 Two Param Cons");
	}
}
public class TestCons {

	public static void main(String[] args) {
		TT2 obj = new TT2(10,20);
		

	}

}
