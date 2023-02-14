package projectOne.pkg;
import java.io.*;
import java.util.ArrayList;

public class Predictor {
	private String className;
	private String fileName;
	private int size;
	private static final int MAX_SIZE = 100;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList <Instance> list = new ArrayList<Instance>();
		
		Instance first = new Instance("Sunny", 80, 80, false);
		System.out.println(first);
		list.add(first);
		
		
	}
}




/*
	private void readFile () {
		BufferedReader lineReader = null;
		try {
			FileReader fr = new FileReader(fileName);
			lineReader = new BufferedReader(fr);
			String line = null;
			while ((line = lineReader.readLine())!=null) {
				String name = lineReader.readLine();
				String id = lineReader.readLine();
				if (line.equals("student")) {
					String gpaString = lineReader.readLine();
					addStudent(new Student(name,id,Double.parseDouble(gpaString)));
				}
				else if (line.equals("instructor")) {
					String email = lineReader.readLine();
					addInstructor(new Instructor(name,id,email));
				}
				else {
					System.err.println("error: unnknown person type");
				}			}
		} catch (Exception e) {
			System.err.println("there was a problem with the file reader, try different read type.");
			try {
				lineReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(fileName.substring(1))));
				String line = null;
				while ((line = lineReader.readLine())!=null) {
					String name = lineReader.readLine();
					String id = lineReader.readLine();
					if (line.equals("student")) {
						String gpaString = lineReader.readLine();
						addStudent(new Student(name,id,Double.parseDouble(gpaString)));
					}
					else if (line.equals("instructor")) {
						String email = lineReader.readLine();
						addInstructor(new Instructor(name,id,email));
					}
					else {
						System.err.println("error: unnknown person type");
					}				}
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
		doWrite(fileName);
	} // end of writeFile method

	public void writeFile(String altFileName) {
		// overloaded method: this calls doWrite with different file name 
		// use this for testing write
		doWrite(altFileName);		
	}// end of writeFile method

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
}

*/



