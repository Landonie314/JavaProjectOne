//Landon Jones
//Project 1
package projectOne.pkg;

public class Instance {

	//Variables
	private String outlook;
	private int temperature;
	private int humidity;
	private boolean windy;
	private String play;
	
	//default constructor
	public Instance() {
		outlook = "";
		temperature = 0;
		humidity = 0;
		windy = false;
		play = "no";
	}
	
	//constructor when pulling from file
	public Instance(String o, int t, int h, boolean w, String p) {
		outlook = o;
		temperature = t;
		humidity = h;
		windy = w;
		play = p;
	}
	
	//Setters and getters
	public String getOutlook() {
		return outlook;
	}
	
	public void setOutlook(String outlook) {
		this.outlook = outlook;
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	public int getHumidity() {
		return humidity;
	}
	
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
	public boolean getWindy() {
		return windy;
	}
	
	public void setWindy(boolean windy) {
		this.windy = windy;
	}
	
	public String getPlay() {
		return play;
	}
	
	public void setPlay(String play) {
		this.play = play;
	}
	
	//toString method
	public String toString () {
		return "outlook: " + outlook + " temperature: " + temperature + " humidity: " + humidity + " windy: " + windy + " play: " + play;
	}
}
