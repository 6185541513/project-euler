import java.util.ArrayList;


public class ID_004 implements Problem{

	private final int MAX_PRODUCT = 99;
	int product1 = MAX_PRODUCT;
	int product2 = MAX_PRODUCT;
	private int TOP_TEN_PERCENT_PRODUCT = (int) MAX_PRODUCT - MAX_PRODUCT/10;
	private int largestPalindrome = 0;
	int potentialMaxPalindrome; 
	ArrayList<Integer> palindromeList = new ArrayList<>();
	
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
	
	// solution #2. start from palindrome perspective. serious solution attempt. sort of. still a shit solution. sort of.
	private void solution2() {
		fillPalindromeList();
		int palindrome;
		int product = MAX_PRODUCT;
		int index = 0;
		boolean done = false;
		do{
			palindrome = palindromeList.get(index);
			do{
				for(int i = product; i >= 0; i--) {
					if(product * i == palindrome) {
						largestPalindrome = palindrome;
						done = true;
						System.out.println(product);
						break;
					}
				}	
				--product;
			}while(product >= 0 && !done);
			++index;
		}while(index <= palindromeList.size()-1);
	}
	
	private void fillPalindromeList() {
		for(int i = MAX_PRODUCT*MAX_PRODUCT; i >= 0; i--) {
			if(isPalindrome(i)) {
				palindromeList.add(i);
			}
		}
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
	
	public void solve() {
		System.out.println(findLargestPalindrome());
	}

}
