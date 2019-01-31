package fizzbuzz;

public class FizzBuzzConverter {

	public String convert(int i) {
		
		if (i % 15 == 0){
			return "FizzBuzz";
		} else if (i % 3 == 0){
			return "Fizz";
		} else if (i % 5 == 0){
			return "Buzz";
		} else {
			return String.valueOf(i);
		}
	}

}
