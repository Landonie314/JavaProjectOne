package projectOne.pkg;

public class Tester {

	public static void main(String[] args) {
		
		Predictor myPredictor = new Predictor("data.txt");
		
		Instance first = new Instance("sunny", 80, 80, true, "no");
		myPredictor.addInstance(first);
		
	}

}
