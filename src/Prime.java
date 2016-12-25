
public class Prime {

    public static  boolean meetsCondition(int n) {
	//sanity check if n is at least lowest prime number
	if(n < 2) {
	    return false;
	}
	
	//opt prep check if n is lowest - even or odd - prime
	if(n == 2 || n == 3) {
	    return true;
	}
	
	//opt prep check if n is even number
	if(!Odd.meetsCondition(n)) {
	    return false;
	}

	//check if n is divisible with any odd number greater than 1, and smaller than n
	for(int i = 3; i < n; i+=2) {
	    if(n % i == 0){
		return false;
	    }
	}

	return true;
    }
}
