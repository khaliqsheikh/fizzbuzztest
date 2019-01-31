package fizzbuzz;

import junit.framework.Assert;
import junit.framework.TestCase;

public class FizbuzzConverter extends TestCase {

	public void testForNormalNumbers(){
		Assert.assertEquals("1", new FizzBuzzConverter().convert(1));
		Assert.assertEquals("2", new FizzBuzzConverter().convert(2));
	}
	
	
	public void testForNumberThree(){
		FizzBuzzConverter converter = new FizzBuzzConverter();
		
		Assert.assertEquals("Fizz", converter.convert(3));
	}
	
	public void testForNumberFive(){
		FizzBuzzConverter converter = new FizzBuzzConverter();
		
		Assert.assertEquals("Buzz", converter.convert(5));
	}
	
	public void testForMultipleNumberThreeFive(){
		FizzBuzzConverter converter = new FizzBuzzConverter();
		
		Assert.assertEquals("FizzBuzz", converter.convert(15));
	}
}
