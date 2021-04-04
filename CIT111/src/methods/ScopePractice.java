package methods;



/**
 *
 * @author Alia
 */
public class ScopePractice {
    


    
    // UNCOMMENT for printing
    
    
    
           
    
    // member variables (aka fields, class members)
    private static String hatType = "Baker's hat";
    private static boolean davidInSubstrate = false;
    private static String alarm = "System alert!";
    
    public static void main(String[] args) {
        System.out.println("[begin execution in main]");
        locateDanceStudio();
        knockOffHat();
        accessPumpingStation();
        toggleDavidCondition();
        System.out.println("[end execution in main]");
    } // close main
    
    public static void locateDanceStudio(){
        System.out.println("Elise!");
        turnKnobLeft();
        toggleDavidCondition();
        
    } // close method locateDanceStudio
    
    public static void turnKnobLeft(){
        knockOffHat();
        toggleDavidCondition();
        String bigBoss = "chairman";
        System.out.println("Visit the " + bigBoss);
        
    } // close method turnKnobLeft
    
    public static void knockOffHat(){
        System.out.println("Knocking off " + hatType);
        System.out.println(alarm);
        
    } // close method knockOffHat
    
    public static void accessPumpingStation(){
        String alarm = "Unauthorized entry!";
        System.out.println(alarm);
        
    } // close access pumping station
    
    private static void toggleDavidCondition(){
        davidInSubstrate = !davidInSubstrate;
        System.out.println("[toggled davidInsubstrate to " 
                + davidInSubstrate + "]");
    } // close toggleDavidCondition method
    
    
} // close class ScopePracticeKey