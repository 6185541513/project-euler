
import java.util.*;

public class ID_010 implements Problem {

    private final int LIMIT = 2000000;
    private boolean[] arr = new boolean[LIMIT];/*false = NOT prime*/
    
    private long summationOfPrimes(){
	Arrays.fill(arr, true);
	long sum = 0L;
	/*for(int i = 1; i < LIMIT; i++){
	    if(Odd.meetsCondition(i) && Prime.meetsCondition(i)) {
		sum +=i;
		System.out.print(", " + i);
	    }
	}*/
	
	for(int i = 2; i < LIMIT; i++) {
	    if(arr[i]) {
		sum += i;
		for(int j = i+i; j < LIMIT; j+=i) {
		    arr[j] = false;
		}
	    }
	}
	
	return sum;
	
    }
    
    public void solve(){
	System.out.println("10. Summation of primes: " + summationOfPrimes());
    }
}
