package projectOne.pkg;

public class Instance {

	//Varibles
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
	
	public String getOutlook() {
		return outlook;
	}
	
	public void setOutlook(String o) {
		outlook = o;
	}
	
	
	
}
