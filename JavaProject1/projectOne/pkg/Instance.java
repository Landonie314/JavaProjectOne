package projectOne.pkg;

public class Instance {

	//Variables
	private String outlook;
	private int temperature;
	private int humidity;
	private boolean windy;
	private boolean play;
	
	public Instance() {
		outlook = "";
		temperature = 0;
		humidity = 0;
		windy = false;
		play = true;
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
	
	public void setOutlook(String o) {
		outlook = o;
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	public void setTemperature(int t) {
		temperature = t;
	}
	
	public int getHumidity() {
		return humidity;
	}
	
	public void setHumidity(int h) {
		humidity = h;
	}
	
	public boolean getWindy() {
		return windy;
	}
	
	public void setWindy(boolean w) {
		windy = w;
	}
	
	
}
