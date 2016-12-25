import java.util.ArrayList;


public class ProjectEuler {
	
	public static void main(String [] args) {
		Problem problem = new ID_007();
		problem.solve();
		System.out.println("1051 is prime: " + Prime.meetsCondition(1051) +
				   ", but 1052 is not: " + Prime.meetsCondition(1052));
	}//main
	
}
