package Class1;

public class Example1 {
    public static void main(String[] args) {
        

        String s = "Cows";
        String b = "Fridge";

        String d = wordMixer(b, s); 

        System.out.println(d);

    }


    public static String wordMixer(String word1, String word2){
        return word2 + "banana" + word1;
    }
}
