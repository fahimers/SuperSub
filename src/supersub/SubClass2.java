package supersub;
/**
 *Calling a method in an instance of the subclass, 
 * that is stored in a field of the
 * superclass’ type. This program prints from subClass2
 * @author Elias
 */

    
public class SubClass2 extends SuperSub { 
    @Override
    public void overideThisMethod(){
        System.out.println("from subClass2");
    }
    public static void main(String[] args){
        SubClass2 subClass2= new SubClass2();
        subClass2.overideThisMethod();
        SuperSub superSub = new SubClass2();
        superSub.overideThisMethod();
    }
}
