package javaProgramTuk;

public class CalculateCube {
    static int cube(int x) {
        return x * x * x;

    }

    public static void main(String[] args) {
        int results = CalculateCube.cube(5);
        System.out.println(results);
    }
}
