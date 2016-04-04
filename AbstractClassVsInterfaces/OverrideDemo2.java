class AA{
	int a;
	int b;
	double c;
	AA(){
		a = 10;
		b= 20;
		c = 30;
	}
}
class BB extends AA{
	int p = 100;
}
class CC
{
	
}
// Covariant return type (1.5)
class Parent
{
	AA show(){
		AA obj = new AA();
		return obj;
	}
}
class Child extends Parent{
	@Override
	BB show(){
		BB obj = new BB();
		return obj;
	}
}
public class OverrideDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
