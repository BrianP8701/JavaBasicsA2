package Class2;

public class Booleanlogic {
    
    public static void main(String[] args) {
        
        // Booleans are a data type - They can hold two values
        // True / False

        boolean b = false;

        boolean c = true;

        int x = 5;

        //       AND  -> Only if both are true
        // If x is greater than 0 AND x is equal to 5
        if(x > 0 && x == 5){
            System.out.println("Rhino");
        }

        //       OR   ->  If one of them is true the whole thing is true
        // If x is greater than 0 OR x is equal to 6
        if(x > 0 || x == 6){
            System.out.println("Rhino");
        }


        // You do the ANDs first
        if(c && (b || c)){
//       true        true    ->    true
            System.out.println("Water");
        }

//     if  c and b are true  ->  true
        if(c && b){
            System.out.println("Hello");
        }

    }

}
