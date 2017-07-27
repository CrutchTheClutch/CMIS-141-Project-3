package guitar;

/**
 * File: TestGuitar.java
 * Author: William Crutchfield
 * Date: February 21, 2016
 * Description: Creates multiple Guitar instances and displays their parameters.
 */
public class TestGuitar {
    public static void main(String[] args) {

        // guitar1 Constructor and toStringMethod
        Guitar guitar1 = new Guitar();
        System.out.println(guitar1.toString());

        // guitar2 Constructor and toStringMethod
        Guitar guitar2 = new Guitar(4, false, 50);
        System.out.println(guitar2.toString());

        // guitar3 Constructor and toStringMethod
        Guitar guitar3 = new Guitar(8,true,15);
        System.out.println(guitar3.toString());

        // guitar4 Constructor and toStringMethod
        Guitar guitar4 = new Guitar(6,false,95);
        System.out.println(guitar4.toString());

        // guitar5 Constructor and toStringMethod
        Guitar guitar5 = new Guitar(10,true,5);
        System.out.println(guitar5.toString());
    }
}
