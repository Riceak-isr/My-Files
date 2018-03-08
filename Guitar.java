/**
  *File: Guitar.java
  *Author: 
  *Date: November 15, 2017
  *Details: class for mainGuitar.java program
            establishes attributes for numStrings, length, Manufacturer, and Color.
*/

public class Guitar {

	private int numStrings = 6;
	private double guitarLength = 28.2;
	private String guitarManufacturer = "Gibson";
	private String guitarColor = "Red";
	
	public Guitar () {
		numStrings = 6;
		guitarLength = 28.2;
		guitarManufacturer = "Gibson";
		guitarColor = "Red";
	}

	public Guitar(int numStrings, double guitarLength, String guitarManufacturer, String guitarColor) {
		super();
		this.numStrings = numStrings;
		this.guitarLength = guitarLength;
		this.guitarManufacturer = guitarManufacturer;
		this.guitarColor = guitarColor;
	}

	public int getNumStrings() {
		return numStrings;
	}

	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}

	public double getGuitarLength() {
		return guitarLength;
	}

	public void setGuitarLength(double guitarLength) {
		this.guitarLength = guitarLength;
	}

	public String getGuitarManufacturer() {
		return guitarManufacturer;
	}

	public void setGuitarManufacturer(String guitarManufacturer) {
		this.guitarManufacturer = guitarManufacturer;
	}

	public String getGuitarColor() {
		return guitarColor;
	}

	public void setGuitarColor(String guitarColor) {
		this.guitarColor = guitarColor;
	}
	
	public String playGuitar () {
		
		String musicBox;
		
		char[] musicNotes = {'A','B','C','D','E','F', 'G'};
		String[] musicDuration = {"0.25","0.50","0.75","1.0","1.25","1.50","1.75","2.0","2.25","2.50","2.75","3.0",
				"3.25","3.50","3.75","4.0"};
		
		int[] i = new int[16], j = new int [16];
		
		for (int k = 0; k < 16; k++) {
			i[k] = (int)(Math.random() * 7);
			j[k] = (int)(Math.random() * 16);
		}
		
		musicBox = "playGuitar(): [" + musicNotes[i[0]] + "(" + musicDuration[j[0]] + "),"
				+"" + musicNotes[i[1]] + "(" + musicDuration[j[1]] + "), "
				+ "" + musicNotes[i[2]] + "(" + musicDuration[j[2]] + "), "
				+ "" + musicNotes[i[3]] + "(" + musicDuration[j[3]] + "), "
				+ "" + musicNotes[i[4]] + "(" + musicDuration[j[4]] + "), "
				+ "" + musicNotes[i[5]] + "(" + musicDuration[j[5]] + "), "
				+ "" + musicNotes[i[6]] + "(" + musicDuration[j[6]] + "), "
				+ "" + musicNotes[i[7]] + "(" + musicDuration[j[7]] + "), "
				+ "" + musicNotes[i[8]] + "(" + musicDuration[j[8]] + "),\n "
				+ "" + musicNotes[i[9]] + "(" + musicDuration[j[9]] + "), "
				+ "" + musicNotes[i[10]] + "(" + musicDuration[j[10]] + "), "
				+ "" + musicNotes[i[11]] + "(" + musicDuration[j[11]] + "), "
				+ "" + musicNotes[i[12]] + "(" + musicDuration[j[12]] + "), "
				+ "" + musicNotes[i[13]] + "(" + musicDuration[j[13]] + "), "
				+ "" + musicNotes[i[14]] + "(" + musicDuration[j[14]] + "), "
				+ "" + musicNotes[i[15]] + "(" + musicDuration[j[15]] + ")], ";
																				
		
		return musicBox;
	}
	
	public String toString() {
		String st = "***Output***\n" + "toString(): "
				+ "(numString = " + numStrings + ", "
				+ "Length = " + guitarLength + ", "
				+ "Manufacturer = " + guitarManufacturer + ", "
				+ "Color = " + guitarColor + ")\n"
				+ "getNumStrings(): " + getNumStrings() + "\n"
				+ "getGuitarLength(): " + getGuitarLength() + "\n"
				+ "getGuitarManufacturer(): " + getGuitarManufacturer() + "\n"
				+ "getGuitarColor(): " + getGuitarColor() + "\n";
		
				return st;
	}
	
}
