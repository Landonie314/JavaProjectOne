//Landon Jones
//Project 1
package projectOne.pkg;

public class Tester {

	public static void main(String[] args) {
		
		
		Predictor myPredictor = new Predictor("./projectOne/data2.txt");
		System.out.println("Test read of the file");
		//prints out the ArrayList of instances
		System.out.println(myPredictor);
		
		//Adding instances
		Instance i2 = new Instance("sunny", 90,0, true, "no");
		myPredictor.addInstance(i2);
		System.out.println(myPredictor);
		//Uses my random instance maker so I don't have to
		myPredictor.initializeRandom();
		myPredictor.addInstance(myPredictor.randomInstance());
		myPredictor.addInstance(myPredictor.randomInstance());
		myPredictor.addInstance(myPredictor.randomInstance());
		System.out.println("\nTesting random");
		System.out.println(myPredictor);
		
		//Changes humidity
		i2.setHumidity(30);
		System.out.println("\nTesting changing an attribute");
		System.out.println(myPredictor);
		
		//Activity options
		System.out.println("\nAvailable activities");
		System.out.println(myPredictor.getActivities());
		
		//Predict activity
		String test = myPredictor.getActivity("sunny", 97, 80, true);
		System.out.println("\nPrint prediction");
		System.out.println(test);
		
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


