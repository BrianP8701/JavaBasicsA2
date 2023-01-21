package Class3;

public class arrays {

    public static void main(String[] args) {
        
        // Primitive Data Types: word, numbers, decimals...

        // Object: Array

        // int array
        int[] calendar = {1, 2, 3, 4, 5, 6};

        // String array                 0       1        2        3
        String[] myFavoriteColors = {"Blue", "Green", "White", "Yellow"};

        boolean[] arr = {true, false, false, false, true};

        // Or, I can create an empty array with a specified size
        String[] array = new String[5];

        array[0] = "Cow";
        array[1] = "Cow";
        array[2] = "cow";
        array[3] = "COW";
        array[4] = "cow";

        print(array);

        
    }

    public static void print(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
