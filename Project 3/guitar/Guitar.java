package guitar;

/*
* File: Guitar.java
* Author: William Crutchfield
*/
public class Guitar {
    //Class Variables
    private String guitarMake = "Epiphone";
    private String guitarModel = "Les Paul Standard";
    private int numOfStrings = 6;
    private int ampVol = 0;
    private boolean tuned = false;
    int distortionAmount = 0;
    private static int numGuitars = 0;
    
    //Constructors
    //Default Constructor
    public Guitar() {
        this.ampVol = 10;
        this.tuned = true;
        this.distortionAmount = 0;
        numGuitars++;
    }
    public Guitar (int ampVol, boolean tuned, int distortionAmount) {
        this.ampVol = ampVol;
        this.tuned = tuned;
        this.distortionAmount = distortionAmount;
        numGuitars++;
    }
    
    //toString Method
    @Override
    public String toString() {
        return "Guitar Number: " + numGuitars + 
               "\nGuitar Make: " + guitarMake +
               "\nGuitar Model: " + guitarModel +
               "\nNumber Of Strings: " + numOfStrings +
               "\nAmp Volume: " + ampVol +
               "\nTuned: " + tuned +
               "\nDistortion Amount: " + distortionAmount + "%" + 
               "\n";
    }
    
    //Getter Methods
    public String getGuitarMake() {
        return guitarMake;
    }
    public String getGuitarModel() {
        return guitarModel;
    }
    public int getNumOfStrings() {
        return numOfStrings;
    }
    public int getAmpVol() {
        return ampVol;
    }
    public boolean getTuned() {
        return tuned;
    }
    public int getDistortionAmount() {
        return distortionAmount;
    }
    public static int getNumGuitars() {
        return numGuitars;
    }
    
    //Setter Methods
    public void setGuitarMake(final String guitarMake) {
        this.guitarMake = guitarMake;
    }
    public void setGuitarModel(final String guitarModel) {
        this.guitarModel = guitarModel;
    }
    public void setNumOfStrings(final int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }
    public void setAmpVol(int ampVol) {
        this.ampVol = ampVol;
    }
    public void setTuned(boolean tuned) {
        this.tuned = tuned;
    }
    public void setDistortionAmount(int distortionAmount) {
        this.distortionAmount = distortionAmount;
    }
    public void setNumGuitars(int numGuitars) {
        Guitar.numGuitars = numGuitars;
    }
}
