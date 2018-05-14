package supersub;

/**
 * This program is a simple example on how you can use super and subclasses
 * @author Elias
 */
public class Subclass extends SuperSub {
    public void overideThisMethod(){
        System.out.println("From subclas");
        super.overideThisMethod(); // Can be used too call the method from super class
    }
    public static void main (String[] arg){
        Subclass subclass = new Subclass();
        subclass.overideThisMethod();
    }
    
}
