
public class ID_006 implements Problem{

    private int sumSquareDifference() {
	return (squareOfSum() - sumOfSquares());
    }

    private int squareOfSum() {
	int sum = 0;
	for(int i = 1; i <=100; i++) {
	    sum += i;
	}

	return sum * sum;
    }

    private int sumOfSquares() {
	int sumOfSquares = 0;
	for(int i = 1; i <= 100; i++) {
	    sumOfSquares += (i*i);
	}

	return sumOfSquares;
    }
    
    public void solve(){
	System.out.println("sum square difference: " + sumSquareDifference());
    }
}
