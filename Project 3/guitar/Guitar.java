package guitar;

/**
 * File: Guitar.java
 * Author: William Crutchfield
 * Date: February 21, 2016
 * Description: Guitar Objects, parameters of guitar are displayed with a toString method
 */
public class Guitar {

    // Variables
    private String guitarMake = "Epiphone";
    private String guitarModel = "Les Paul Standard";
    private int numOfStrings = 6;
    private int ampVol = 0;
    private boolean tuned = false;
    private int distortionAmount = 0;
    private static int numGuitars = 0;

    /**
     * Default Constructor for Guitar
     */
    Guitar() {
        this.ampVol = 10;
        this.tuned = true;
        this.distortionAmount = 0;
        numGuitars++;
    }

    /**
     * Constructor with args for Guitar
     * @param ampVol the level of the guitar amp
     * @param tuned boolean if guitar is tuned
     * @param distortionAmount amount of distortion effect added to the guitar
     */
    Guitar(int ampVol, boolean tuned, int distortionAmount) {
        this.ampVol = ampVol;
        this.tuned = tuned;
        this.distortionAmount = distortionAmount;
        numGuitars++;
    }

    /**
     * toString method that displays guitar params
     * @return formatted list of guitar params
     */
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
}
