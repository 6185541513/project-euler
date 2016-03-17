import java.util.ArrayList;


public class ID_002 implements Problem{
	private final long MAX = 4000000L; 
	private long sum = 0L;
	
	private void sumEvenFibonacciNumbers() {
		int index = 0;
		long value = 0L;
		
		while(value <= MAX) {
			value = fibonacci(index);
			if(isEven(value)) {
				sum(value);
			}
			++index;
		}
	}//sumEvenFibonacciNumbers
	
	private long fibonacci(int i) {
		switch(i) {
		case 0:
			return 1;
		case 1:
			return 2;
		default:
			return fibonacci(i - 1) + fibonacci(i - 2);
		}
	}//fibonacci
	
	private boolean isEven(long n) {
		return (n % 2 == 0) ? true : false;
	}//isEven
	
	private void sum(long n) {
		sum += n;
	}//sum
	
	public void solve() {
		sumEvenFibonacciNumbers();
		System.out.println(sum);
	}//solve

}
