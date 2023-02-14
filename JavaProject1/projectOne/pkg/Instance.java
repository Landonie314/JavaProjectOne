package projectOne.pkg;

public class Instance {

	//Variables
	private String outlook;
	private int temperature;
	private int humidity;
	private boolean windy;
	
	
	public Instance() {
		outlook = "";
		temperature = 0;
		humidity = 0;
		windy = false;
	}
	
	public Instance(String o, int t, int h, boolean w) {
		outlook = o;
		temperature = t;
		humidity = h;
		windy = w;
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
	
	public String toString () {
		return "outlook: " + outlook + " temperature: " + temperature + " humidity: " + humidity + " windy: " + windy;
	}
}
