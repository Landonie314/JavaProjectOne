package projectOne.pkg;

public class Tester {

	public static void main(String[] args) {
		
		Predictor myPredictor = new Predictor("./JavaProject1/data.txt");
		System.out.println("Test read of the file");
		System.out.println(myPredictor);
		
		myPredictor.changeActivity();
		System.out.println("Test read after changes");
		System.out.println(myPredictor);
		
		
	}

}
