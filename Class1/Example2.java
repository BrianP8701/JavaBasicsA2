package Class1;

public class Example2 {

    public static void main(String[] args) {
        System.out.println(magic(2, 3, 4));

    }

    public static int magic(int x, int y, int z){
        int part1 = x + y;
        int part2 = x + z;
        return part1 - part2;
    }
}
