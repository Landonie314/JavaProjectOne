package projectOne.pkg;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

//What is the point of the predictor class??
public class Predictor {
	private String fileName;
	private String activity;
	private boolean play;
	private ArrayList<String> act = new ArrayList<String>();
	private ArrayList <Instance> pre = new ArrayList<Instance>();
		
	
		//Instance first = new Instance("Sunny", 80, 80, false);
		//Instance second = new Instance("Rainy", 30, 30, false);
		//Instance third = new Instance("cloudy", 80, 10, true);
		
		//Constructor
		public Predictor(String fn) {
			fileName = fn;
			readFile();
			
		}
		
		//adds instance to the ArrayList of instances
		public void addInstance(Instance i) {
			pre.add(i);
		}
		
		public void changeActivity() {
			//Iterator <Instance> iter = pre.iterator();
			//while(iter.hasNext()) {
					
			//}
			for(int i=0; i<pre.size(); i++) {
				if(pre.get(i).getWindy() == true && pre.get(i).getOutlook().equals("sunny")) {
					pre.get(i).setPlay("Swimming");
				}
				else if(pre.get(i).getWindy() == false) {
					pre.get(i).setPlay("Tennis");
				}
				else if(pre.get(i).getWindy() == true && pre.get(i).getOutlook().equals("rainy")) {
					pre.get(i).setPlay("Video Games");
				}
				else {
					pre.get(i).setPlay("Running");
				}
			}
		}




		//Reads in the arff file
	private void readFile () {
		BufferedReader lineReader = null;
		try {
			FileReader fr = new FileReader(fileName);
			lineReader = new BufferedReader(fr);
			String line = null;
			while ((line = lineReader.readLine())!=null) {
				//Array of strings. Each string is sepaSrated by a comma on the line so the token stores each word.
				String[] tokens = line.split(",");
				String outlook = tokens[0];
				String temperature = tokens[1];
				String humidity = tokens[2];
				String windy = tokens[3];
				String play = tokens[4];
					addInstance(new Instance(outlook,Integer.parseInt(temperature),Integer.parseInt(humidity), Boolean.parseBoolean(windy), play));
					
				
				}			
		} catch (Exception e) {
			System.err.println("there was a problem with the file reader, try different read type.");
			try {
				lineReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(fileName.substring(1))));
				String line = null;
				while ((line = lineReader.readLine())!=null) {
					//Array of strings. Each string is separated by a comma on the line so the token stores each word.
					String[] tokens = line.split(",");
					String outlook = tokens[0];
					String temperature = tokens[1];
					String humidity = tokens[2];
					String windy = tokens[3];
					String play = tokens[4];
					addInstance(new Instance(outlook,Integer.parseInt(temperature),Integer.parseInt(humidity), Boolean.parseBoolean(windy), play));
						}
			} catch (Exception e2) {
				System.err.println("there was a problem with the file reader, try again.  either no such file or format error");
			} finally {
				if (lineReader != null)
					try {
						lineReader.close();
					} catch (IOException e2) {
						System.err.println("could not close BufferedReader");
					}
			}			
		} finally {
			if (lineReader != null)
				try {
					lineReader.close();
				} catch (IOException e) {
					System.err.println("could not close BufferedReader");
				}
		}
	} // end of readFile method	

	public void writeFile () {
		// overloaded method: this calls doWrite with file used to read data
		// use this for saving data between runs
		/////doWrite(fileName);
	} // end of writeFile method

	public void writeFile(String altFileName) {
		// overloaded method: this calls doWrite with different file name 
		// use this for testing write
		///////doWrite(altFileName);		
	}// end of writeFile method

	/*
	private void doWrite(String fn) {
		// this method writes all of the data in the persons array to a file
		try
		{

			FileWriter fw = new FileWriter(fn);
			BufferedWriter myOutfile = new BufferedWriter(fw);			

			for (int i = 0; i < size; i++) {
				Person person = people[i];
				if (person instanceof Student) {
					myOutfile.write ("student\n");
					myOutfile.write (person.getName()+"\n");
					myOutfile.write (person.getId()+"\n");
					myOutfile.write (((Student) person).getGpa()+"\n");
				}
				else if (person instanceof Instructor) {
					myOutfile.write ("instructor\n");
					myOutfile.write (person.getName()+"\n");
					myOutfile.write (person.getId()+"\n");
					myOutfile.write (((Instructor) person).getEmail()+"\n");
				}	
				else {
					System.err.println("error in array, instance type not found");
				}
			}
			myOutfile.flush();
			myOutfile.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.err.println("Didn't save to " + fn);
		}
	}	

*/



}
