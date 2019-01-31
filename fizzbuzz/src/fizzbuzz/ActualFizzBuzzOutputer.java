package fizzbuzz;

public class ActualFizzBuzzOutputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzzConverter fizzbuzz = new FizzBuzzConverter();
		
		for (int i=1; i <= 100; i++){
			System.out.println(fizzbuzz.convert(i));
		}
	}

}
