
public class ID_007 implements Problem {
    //methods are specialized rather than general, since there is no
    //foreseen need for the latter regarding finding prime of certain index

    private final int INDEX_X = 10001;
    
    private int primeOfIndexX() {
	int n = 3;//start on first uneven prime (2nd prime in order)

	for(int i = 3; i <= INDEX_X; i++) {//start on index after first uneven prime
	    n += 2;
	    while(!Prime.meetsCondition(n)){
		n += 2;
	    }//while
	}//for
	
	return n;
    }
    
    public void solve() {
	System.out.println("10.001st prime: " + primeOfIndexX());
    }
}
