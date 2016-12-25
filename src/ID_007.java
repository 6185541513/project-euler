
public class ID_007 implements Problem {

    private final int PRIME_MIN = 2;
    private final int INDEX_X = 10001;
    
    private int primeOfIndexX() {
	int prime = 3;//start on first uneven prime (2nd prime in order)
	boolean keepGoing;

	for(int i = 3; i <= INDEX_X; i++) {//start on index after first uneven prime
	    prime += 2;
	    while(!isPrime(prime)){
		prime += 2;
	    }//while
	}//for
	
	return prime;
    }

    private boolean isPrime(int n) {
	for(int i = 2; i < n; i++){
	    if(n % i == 0) {
		return false;
	    }
	}

	return true;
    }
    
    public void solve() {
	System.out.println("10.001st prime: " + primeOfIndexX());
    }
}
