import org.testng.Assert;
import org.testng.annotations.Test;

// here i am doing testing of my functionality
// TestSuite
// TestCase
public class TestCalc {
	@Test
	public void testAddTwoIntegers(){
	int firstNO = 10;
	int secondNo = 20;
	int expectedResult = 30;
	Calc obj = new Calc();
	int result = obj.add(firstNO, secondNo);
	Assert.assertEquals(result, expectedResult);
	
}
	@Test(priority=1)
	public void testAddTwoStrings(){
	String firstNO = "10";
	String secondNo = "20";
	int expectedResult = 30;
	Calc obj = new Calc();
	int result = obj.add(firstNO, secondNo);
	Assert.assertEquals(result, expectedResult);
	
}
	@Test(enabled=false)
	public void testAddTwoNegative(){
	int firstNO = -10;
	int secondNo = -20;
	int expectedResult = 0;
	Calc obj = new Calc();
	int result = obj.add(firstNO, secondNo);
	Assert.assertEquals(result, expectedResult);
	
}
	@Test(timeOut=1)
	public void testAddTwoIntegersUnder10sec(){
	int firstNO = 10;
	int secondNo = 20;
	int expectedResult = 30;
	Calc obj = new Calc();
	int result = obj.add(firstNO, secondNo);
	Assert.assertEquals(result, expectedResult);
	
}
}
