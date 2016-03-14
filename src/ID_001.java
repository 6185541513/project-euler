import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ID_001 implements Problem {
	// limit for multiples
	private final int LIMIT = 1000;

	// sums the given multiples below the limit
	private int sumMultiplesBelowLimit(int multiple_x, int multiple_y) {
		int sum = 0;

		sum = solution1();
		sum = solution2();
		
		return sum;
	}
	
	// solution #1
	private int solution1() {
		int sum = 0;
		
		for(int i = 3; i < LIMIT; i+=3) {
			sum +=i;
		}
		
		for(int i = 5; i < LIMIT; i+=5) {
			if(!isDivisible(3, i)) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	// solution #2
	private int solution2() {
		int sum = 0;
		int index = 3;
		Set<Integer> multiplesToSum = new HashSet<Integer>();
		
		while(index < LIMIT){
			if(isDivisible(3, index) || isDivisible(5, index)) {
				multiplesToSum.add(index);
			}
			index++;
		}
		
		Iterator<Integer> iterator = multiplesToSum.iterator();
		while(iterator.hasNext()) {
			sum += iterator.next();
		}
		
		return sum;
	}
	
	// returns whether reminder of dividend mod divisor is zero
	private boolean isDivisible(int dividend, int divisor) {
		return (dividend % divisor == 0) ? true : false;
	}
	
	@Override
	public void solve(){
		System.out.println(sumMultiplesBelowLimit(3, 5));
	}//solve
}
