import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ID_001 implements Problem {
	// limit for multiples
	private final int LIMIT = 1000;
	
	// multiples 
	private final int MULTIPLE_X = 3;
	private final int MULTIPLE_Y = 5;

	/**
	 * Contains two method calls which calculate sum of the two multiples below the given limit
	 * @return sum of multiples of {@value #MULTIPLE_X} and {@value #MULTIPLE_Y} below {@value #LIMIT} 
	 */
	private int sumMultiplesBelowLimit() {
		int sum = 0;

		//sum = solution1();
		sum = solution2();
		
		return sum;
	}//sumMultiplesBelowLimit
	
	/**
	 * Solution #1 <br>
	 * First sums multiples of {@value #MULTIPLE_X} below {@value #LIMIT}. Then sums multiples of {@value #MULTIPLE_Y},
	 * except the multiples of {@value #MULTIPLE_X} that has already been summed.
	 * @return sum of multiples of {@value #MULTIPLE_X} and {@value #MULTIPLE_Y} below {@value #LIMIT} 
	 */
	private int solution1() {
		int sum = 0;
		
		for(int i = MULTIPLE_X; i < LIMIT; i += MULTIPLE_X) {
			sum += i;
		}
		
		for(int i = MULTIPLE_Y; i < LIMIT; i += MULTIPLE_Y) {
			if(!isDivisible(i, MULTIPLE_X)) {
				sum += i;
			}
		}
		
		return sum;
	}//solution1
	
	/**
	 * Solution #2 <br>
	 * Iterates through every number between {@value #MULTIPLE_X} and {@value #LIMIT} to see if their reminder
	 * equals zero with modulo operation performed for both {@value #MULTIPLE_X} and {@value #MULTIPLE_Y}. If so,
	 * the number is placed in a HashSet to avoid duplicates and the HashSet content is summed.
	 * @return sum of multiples of {@value #MULTIPLE_X} and {@value #MULTIPLE_Y} below {@value #LIMIT} 
	 */
	private int solution2() {
		int sum = 0;
		int index = MULTIPLE_X;
		Set<Integer> multiplesToSum = new HashSet<Integer>();
		
		while(index < LIMIT){
			if(isDivisible(index, MULTIPLE_X) || isDivisible(index, MULTIPLE_Y)) {
				multiplesToSum.add(index);
			}
			index++;
		}
		
		Iterator<Integer> iterator = multiplesToSum.iterator();
		while(iterator.hasNext()) {
			sum += iterator.next();
		}
		
		return sum;
	}//solution2
	
	/**
	 * Returns whether reminder of dividend modulo divisor equals zero 
	 * @param dividend The dividend
	 * @param divisor The divisor
	 * @return true if reminder equals zero
	 */
	private boolean isDivisible(int dividend, int divisor) {
		return (dividend % divisor == 0) ? true : false;
	}//isDivisible
	
	@Override
	public void solve(){
		System.out.println(sumMultiplesBelowLimit());
	}//solve
}
