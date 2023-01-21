package Class3;

public class HW2Answers {
    public static void main(String[] args) {
        
        System.out.println(isEven(99999999));

    }

    public static void print(String str){
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
    }

    public static int greatestNumber(int a, int b, int c){
        if(a > b && a > c){
            return a;
        } else if(b > c){
            return b;
        } else{
            return c;
        }
    }

    public static boolean isNegative(int x){
        if(x >= 0){
            return false;
        } else{
            return true;
        }
    }

    public static boolean isEven(int x){
        // % gives us the remainder
        if(x % 2 == 0){
            return true;
        } else{
            return false;
        }
    }

    public static double average(int a, int b, int c, int d){
        double x = a + b + c + d;
        return x / 4;
    }

}
