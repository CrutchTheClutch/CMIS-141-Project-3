package guitar;

/*
* File: TestGuitar.java
* Author: William Crutchfield
*/
public class TestGuitar {
    public static void main(String[] args) {
    
    //Guitar 1
        //Construct A Default Guitar
        Guitar guitar1 = new Guitar();
        
        //Call toString Method
        System.out.println(guitar1.toString());
        
    //Guitar 2
        //Construct the Guitar
        Guitar guitar2 = new Guitar(4, false, 50);
                
        //Call toString Method
        System.out.println(guitar2.toString());
    }
}
