import java.util.ArrayList;


public class ID_003 implements Problem{
	private ArrayList<Integer> primeNumbers = new ArrayList<>();
	private ArrayList<Integer> primeFactors = new ArrayList<>();
	
	private long findLargestPrimeFactor() {	
		long n = 600851475143L;
		//int n = 13195;
		
		// collect prime numbers
		int limit = (int)Math.sqrt(n);
		for(int i = 2; i <= limit; i++) {
			if(isPrimeNumber(i)) {
				primeNumbers.add(i);
			}
		}
		
		// prime factorization
		primeFactorization(n);
		
		return primeFactors.get(primeFactors.size()-1);
	}//findLargestPrimeFactor
	
	private boolean primeFactorization(long n) {		
		for(Integer currentPrime : primeNumbers) {
			while(n % currentPrime == 0) {
				n /= currentPrime;
				primeFactors.add(currentPrime);
			}
		}
		
		return false;
	}//primeFactorization
	
	private boolean isPrimeNumber(int n) {
		int limit = (int) Math.sqrt(n);
		
		for(int i = 2; i <= limit; i++) {
			if(n % i == 0) { return false; }
		}
		
		return true;
	}//isPrimeNumber
	
	public void solve() {
		System.out.println(findLargestPrimeFactor());
	}//solve

}
