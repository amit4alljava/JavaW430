//interfaces are 100% Abstract Before Java 8
interface IPlayer
{
	int MAX_JUMP = 100;
	int DEFAULT_JUMP = 10;
	int MAX_POWER = 100;
	int MIN_POWER = 5;
	int DEFAULT_POWER = 10;
	public abstract long attack();
	long defense();
	boolean powerIncrement();
	boolean powerDecrement();
	int showPower();
	
}

class BlackPlayer implements IPlayer{
	int currentPower = DEFAULT_POWER;
	@Override
	public long attack() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public long defense() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public boolean powerIncrement() {
		if(currentPower<MAX_POWER){
			currentPower++;
			return true;
		}
		return false;
	}

	@Override
	public boolean powerDecrement() {
		if(currentPower>MIN_POWER){
			currentPower--;
			return true;
		}
		return false;
	}

	@Override
	public int showPower() {
		// TODO Auto-generated method stub
		return currentPower;
	}
	
}
class RedPlayer implements IPlayer{

	@Override
	public long attack() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long defense() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean powerIncrement() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean powerDecrement() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int showPower() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
