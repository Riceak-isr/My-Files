/**
  *File: HeadPhone.java
  *Author: 
  *Date: December 3, 2017
  *Details: part of TestHeadPhone.java
  *   assigns initial values to class arguments and produce string
  *   that is printed through TestHeadPhone.java program.
*/


public class HeadPhone {
	
	//Static Variables
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;
	
	//Local variables
	private int volume;
	private boolean pluggedIn;
	private String manufacturer;
	private String headPhoneColor;
	private String headPhoneModel;
	
	//not sure what this one is!
	public HeadPhone() {
		super();
		
		//assigned values to all local variables.
		volume = MEDIUM;
		pluggedIn = false;
		manufacturer = "Java";
		headPhoneColor = "Red";
		headPhoneModel = "Java1234";	
		
	}
	
	//toString to print output within TestHeadPhone.java file
	@Override
	public String toString() {
		return "HeadPhone [volume=" + volume + ", pluggedIn=" + pluggedIn + ", manufacturer=" + manufacturer
				+ ", headPhoneColor=" + headPhoneColor + ", headPhoneModel=" + headPhoneModel + "]";
	}
	
	public void changeVolume(int volume) {
		this.volume = volume;
	}



	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPluggedIn() {
		return pluggedIn;
	}

	public void setPluggedIn(boolean pluggedIn) {
		this.pluggedIn = pluggedIn;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getHeadPhoneColor() {
		return headPhoneColor;
	}

	public void setHeadPhoneColor(String headPhoneColor) {
		this.headPhoneColor = headPhoneColor;
	}

	public String getHeadPhoneModel() {
		return headPhoneModel;
	}

	public void setHeadPhoneModel(String headPhoneModel) {
		this.headPhoneModel = headPhoneModel;
	}

	public static int getLow() {
		return LOW;
	}

	public static int getMedium() {
		return MEDIUM;
	}

	public static int getHigh() {
		return HIGH;
	}
	
	
}
