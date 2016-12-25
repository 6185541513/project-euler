
public class ID_008 implements Problem {

    private final int SIZE_OF_ADJACENT = 4;
    int[] adjacent = new int[SIZE_OF_ADJACENT];
    
    private int largestProductInSeries() {
	Scanner scanner = new Scanner(new File("integer_series.txt"));
	int i = 0;
	int largestProduct = 0;
	
	//fill adjacent arr (unchecked since has necessary info)
	for(i < SIZE_OF_ADJACENT; i++){
	    adjacent[i] = scanner.nextInt();
	    largestProduct = adjacent[i];
	}//for
	
	while(scanner.hasNextInt()) {
	    if(scanner.nextInt() > getLargest()) {
		
	    }
	    
	}//while

	return largestProduct;
    }

    private int getLargest() {
	int largest = 0;
	for(int i = 0; i < SIZE_OF_ADJACENT; i++) {
	    if(adjacent[i] > largest) {
		largest = adjacent[i];
	    }
	}//for

	return largest;
    }

    //unchecked because reasons
    private int getIndex(int n) {
	for(int i = 0; i < SIZE_OF_ADJACENT; i++) {
	    if(adjacent[i] == n) {
		return i;
	    }
	}//for
	
	return -1;
    }
    
    public void solve() {
	System.out.println("largest product in series: " + largestProductInSeries());
    }
}
