import java.util.ArrayList;


public class ID_003 implements Problem{
	private final long n = 600851475143L;
	private final int t = 13195;
	private ArrayList<Integer> primeFactors = new ArrayList<Integer>();
	
	private long findLargestPrimeFactor() {
		for(int i = 0; i <= t; i++) {
			if(isPrimeFactor(i)) {
				primeFactors.add(i);
			}
		}
		return 0;
	}
	
	private boolean isPrimeFactor(int n) {
		int tmp = 0;
		return false;
	}
	
	private boolean isInteger(int n) {
		return n == (int)n ? true : false;
	}
	
	public void solve() {
		System.out.println(findLargestPrimeFactor());
	}//solve

}
