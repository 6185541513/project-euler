import java.util.ArrayList;


public class ProjectEuler {
	private static ArrayList<Problem> problemList = new ArrayList<Problem>();
	private static int currentProblemId = 0;
	
	public static void add(Problem problem) {
		problemList.add(problem);
	}
	
	public static void main(String [] args) {
		problemList.get(currentProblemId).run();
	}
}
