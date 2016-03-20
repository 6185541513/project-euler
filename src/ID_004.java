
public class ID_004 implements Problem{

	private final int MAX_PRODUCT = 99;
	private int TOP_TEN_PERCENT_PRODUCT = (int) MAX_PRODUCT - MAX_PRODUCT/10;
	private int largestPalindrome = 0;
	private int maxPotentialPalindrome = MAX_PRODUCT * MAX_PRODUCT; 
	
	private int findLargestPalindrome() {
		// solution #1
		solution1();
		
		// solution #2
		solution2();
		
		return largestPalindrome;
	}
	
	// solution #1. top ten percent at a time. cause reasons. secret no reasons. just play.
	private void solution1() {
		int product1 =  MAX_PRODUCT;
		int product2 = TOP_TEN_PERCENT_PRODUCT;
		
		for(int i = TOP_TEN_PERCENT_PRODUCT; i <= MAX_PRODUCT; i++) {
			if(isPalindrome(product1 * i)) {
				product2 = i;
				largestPalindrome = product1*product2;
			}
		}
	}
	
	// solution #2. start from palindrome perspective. serious solution attempt.
	private void solution2() {
		
	}
	
	private boolean isPalindrome(int n) {
		String str = Integer.toString(n);
		int firstIndex = 0;
		int lastIndex = str.length()-1;
		int midIndex = Math.round(lastIndex/2);
		
		for(int i = firstIndex; i <= midIndex; i++) {
			if(str.charAt(firstIndex+i) != str.charAt(lastIndex-i)) {
				return false;
			}
		}
		return true;
	}
	
	private boolean isEven(int n) {
		return n % 2 == 0 ? true : false;
	}
	
	public void solve() {
		System.out.println(findLargestPalindrome());
	}

}
