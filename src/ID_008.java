
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.nio.*;
import java.nio.file.*;

public class ID_008 implements Problem {

    private final int SIZE = 13;
    
    private long largestProductInSeries() {
	int[] largest = new int[SIZE];//largest adjacent arr
	int[] curr = new int[SIZE];//current adjacent arr
	try {
	    Reader reader = Files.newBufferedReader(Paths.get("integer_series.txt"));
	    
	    //fill adjacent arr (unchecked since has necessary info)
	    for(int i = 0; i < SIZE; i++){
		largest[i] = Character.getNumericValue((char)reader.read());
	    }//for
	    curr = largest.clone();

	    int c;
	    while((c = reader.read()) != -1) {
		char ch = (char)c;
		int nextInt = Character.getNumericValue(ch);

		//sanity check to ignore new line
		if(nextInt >= 0){
		    //check if updated curr arr is greater than, or
		    //equal to, largest arr
		    if(getProduct(updateArr(curr, nextInt)) >= getProduct(largest)) {
			largest = curr.clone();
		    }//if
		}//if
	    
	    }//while
	    
	} catch(IOException e) {
	    e.printStackTrace();
	}

	return getProduct(largest);
    }

    private long getProduct(int[] arr) {
	long product = 1L;
	for(int i = 0; i < SIZE; i++) {
	    product *= arr[i];
	}
	return product;
    }

    private int[] updateArr(int[] arr, int n) {
	for(int i = 0; i < SIZE-1; i++) {
	    arr[i] = arr[i + 1];
	}
	arr[SIZE - 1] = n;
	return arr;
    }

    //debug
    private void printArr(int[] arr) {
	for(int i = 0; i < SIZE; i++) {
	    System.out.print(arr[i]);
	}
	System.out.println(" : " + getProduct(arr));
    }
    
    public void solve() {
	System.out.println("largest product in series: " + largestProductInSeries());
    }
}
