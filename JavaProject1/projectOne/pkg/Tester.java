//Landon Jones
//Project 1
package projectOne.pkg;

public class Tester {

	public static void main(String[] args) {
		
		
		Predictor myPredictor = new Predictor("./projectOne/data2.txt");
		System.out.println("Test read of the file");
		//prints out the ArrayList of instances
		System.out.println(myPredictor);
		
		Instance i2 = new Instance("sunny", 90,0, true, "no");
		myPredictor.addInstance(i2);
		System.out.println(myPredictor);
		myPredictor.initializeRandom();
		myPredictor.addInstance(myPredictor.randomInstance());
		System.out.println("\nTesting random");
		System.out.println(myPredictor);
		
		i2.setHumidity(30);
		System.out.println(i2.getHumidity());
		System.out.println(myPredictor);
		
		//Calls change Activity
		myPredictor.changeActivity();
		System.out.println("Test read after changes");
		System.out.println(myPredictor);
		//Writes to a separate file the day with predicted activities
		myPredictor.writeFile("./projectOne/data.txt");
		
		//Writes to the file we store all the data in at the end of the program run
		myPredictor.writeFile();
		
		
		
	}


}
