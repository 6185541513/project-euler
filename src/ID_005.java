
public class ID_005 implements Problem{

    private final int RANGE_MIN = 1;
    private final int RANGE_MAX = 20;
    private int smallestMultiple = 2520;
    
    private int smallestMultiple(){
	boolean keepGoing = true;

	while(keepGoing) {
	    for(int i = RANGE_MAX; i >= RANGE_MIN; i--){
		//if i not evenly devicible with smallestMultiple, break loop
		if(!isEvenlyDevisible(i)){
		    break;
		}
		//else if i is evenly devisible and is value of RANGE_MIN, answer is found
		else if(i == RANGE_MIN && isEvenlyDevisible(i)){
		    return smallestMultiple;
		}
	    }//for
	    ++smallestMultiple;
	}//while

	return -1;
    }

    private boolean isEvenlyDevisible(int value){
	return (smallestMultiple % value == 0 ? true : false);
    }
    
    public void solve(){
	System.out.println("smallest multiple: " + smallestMultiple());
    }
}
